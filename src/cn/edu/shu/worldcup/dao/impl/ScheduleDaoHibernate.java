package cn.edu.shu.worldcup.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.edu.shu.worldcup.dao.ScheduleDao;
import cn.edu.shu.worldcup.domain.Schedule;

/**
 * 
 * @author 陈超
 *
 */
public class ScheduleDaoHibernate extends HibernateDaoSupport implements ScheduleDao {

	public Schedule get(Integer id) {
		return getHibernateTemplate().get(Schedule.class, id);
	}

	public Integer save(Schedule schedule) {
		return (Integer) getHibernateTemplate().save(schedule);
	}

	public void update(Schedule schedule) {
		getHibernateTemplate().update(schedule);
	}

	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}

	public void delete(Schedule schedule) {
		getHibernateTemplate().delete(schedule);
	}

	/**
	 * 根据比赛队伍模糊查询比赛场次
	 * @param team
	 * 			需要查询的比赛队伍的关键字
	 * @return	返回有关的所有Schedule实例
	 */
	@SuppressWarnings("unchecked")
	public List<Schedule> findByTeam(String team) {
		return (List<Schedule>) getHibernateTemplate().find(
				"from Schedule sc where sc.result like ?", "%" + team + "%");
	}
	
	/**
	 * 查询所有比赛场次
	 * @return	返回数据库中所有Schedule实例
	 */
	@SuppressWarnings("unchecked")
	public List<Schedule> findAllSchedule() {
		return (List<Schedule>) getHibernateTemplate().find(
				"from Schedule sc order by sc.id");
	}

}
