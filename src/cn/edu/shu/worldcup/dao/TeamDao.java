package cn.edu.shu.worldcup.dao;

import java.util.List;

import cn.edu.shu.worldcup.domain.Team;

/**
 * 提供对Team的CRUD操作
 * 
 * @author 江辰
 *
 */
public interface TeamDao {
	/**
	 * 根据标识属性来加载Team实例
	 * 
	 * @param id
	 *            需要加载的Team实例的标识属性值
	 * @return 指定标识属性对应的Team实例
	 */
	Team get(Integer id);

	/**
	 * 持久化指定的Team实例
	 * 
	 * @param team
	 *            需要被持久化的Team实例
	 * @return Team实例被持久化后的标识属性值
	 */
	Integer save(Team team);

	/**
	 * 修改指定的Team实例
	 * 
	 * @param team
	 *            需要被修改的Team实例
	 */
	void update(Team team);

	/**
	 * 删除指定的Team实例
	 * 
	 * @param id
	 *            需要被删除的Team实例的标识属性值
	 */
	void delete(Integer id);

	/**
	 * 删除指定的Team实例
	 * 
	 * @param team
	 *            需要被删除的Team实例
	 */
	void delete(Team team);

	/**
	 * 根据名称查询Team实例
	 * 
	 * @param name
	 *            需要查询的球队名称
	 * @return 该球队对应的Team实例
	 */
	public List<Team> findByName(String name);

	/**
	 * 查询全部的Team实例
	 * 
	 * @return 数据库中全部的Team实例
	 */
	public List<Team> findAllTeam();

}
