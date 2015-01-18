package cn.edu.shu.worldcup.dao;

import java.util.List;

import cn.edu.shu.worldcup.domain.Schedule;

/**
 * 提供对Schedule的CRUD操作
 * @author 陈超
 *
 */
public interface ScheduleDao {
	/**
	 * 根据标识属性来加载Scheduler实例
	 * 
	 * @param id
	 *            需要加载的Schedule实例的标识属性值
	 * @return 指定标识属性对应的Schedule实例
	 */
	Schedule get(Integer id);

	/**
	 * 持久化指定的Schedule实例
	 * 
	 * @param schedule
	 *            需要被持久化的Schedule实例
	 * @return Schedule实例被持久化后的标识属性值
	 */
	Integer save(Schedule schedule);

	/**
	 * 修改指定的Schedule实例
	 * 
	 * @param schedule
	 *            需要被修改的Schedule实例
	 */
	void update(Schedule schedule);

	/**
	 * 删除指定的Schedule实例
	 * 
	 * @param id
	 *            需要被删除的Schedule实例的标识属性值
	 */
	void delete(Integer id);

	/**
	 * 删除指定的Schedule实例
	 * 
	 * @param schedule
	 *            需要被删除的Schedule实例
	 */
	void delete(Schedule schedule);

	/**
	 * 根据比赛队伍名字搜索比赛场次
	 * @param team
	 * 			需要查询的比赛队伍名字
	 * @return	返回查询的比赛队伍的所有比赛场次
	 */
	public List<Schedule> findByTeam(String team);

	/**
	 * 搜索全部比赛场次
	 * @return	返回数据库中全部的Schedule实例
	 */
	public List<Schedule> findAllSchedule();
}
