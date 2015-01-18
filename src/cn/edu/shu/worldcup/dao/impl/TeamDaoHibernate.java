package cn.edu.shu.worldcup.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.edu.shu.worldcup.dao.TeamDao;
import cn.edu.shu.worldcup.domain.Team;

/**
 * 提供对Team的CRUD操作
 * 
 * @author 江辰
 *
 */
public class TeamDaoHibernate extends HibernateDaoSupport implements TeamDao {
	/**
	 * 根据标识属性来加载Team实例
	 * 
	 * @param id
	 *            需要加载的Team实例的标识属性值
	 * @return 指定标识属性对应的Team实例
	 */
	@Override
	public Team get(Integer id) {
		return getHibernateTemplate().get(Team.class, id);
	}

	/**
	 * 持久化指定的Team实例
	 * 
	 * @param team
	 *            需要被持久化的Team实例
	 * @return Team实例被持久化后的标识属性值
	 */
	@Override
	public Integer save(Team team) {
		return (Integer) getHibernateTemplate().save(team);
	}

	/**
	 * 修改指定的Team实例
	 * 
	 * @param team
	 *            需要被修改的Team实例
	 */
	@Override
	public void update(Team team) {
		getHibernateTemplate().update(team);
	}

	/**
	 * 删除指定的Team实例
	 * 
	 * @param id
	 *            需要被删除的Team实例的标识属性值
	 */
	@Override
	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}

	/**
	 * 删除指定的Team实例
	 * 
	 * @param team
	 *            需要被删除的Team实例
	 */
	@Override
	public void delete(Team team) {
		getHibernateTemplate().delete(team);
	}

	/**
	 * 根据名称查询Team实例
	 * 
	 * @param name
	 *            需要查询的球队名称
	 * @return 该球队对应的Team实例
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Team> findByName(String name) {
		return (List<Team>) getHibernateTemplate().find(
				"from Team t where t.name = ?", name);
	}

	/**
	 * 查询全部的Team实例
	 * 
	 * @return 数据库中全部的Team实例
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Team> findAllTeam() {
		return (List<Team>) getHibernateTemplate().find(
				"from Team t order by t.group");
	}

}
