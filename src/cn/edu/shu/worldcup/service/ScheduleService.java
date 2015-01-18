package cn.edu.shu.worldcup.service;

import java.util.Iterator;

import cn.edu.shu.worldcup.domain.Schedule;

/**
 * 比赛日程相关业务逻辑
 * @author 陈超
 *
 */
public interface ScheduleService {
	/**
	 * 添加新的比赛日程
	 * 
	 * @param schedule
	 *            试图添加的Schedule实例
	 * @return 添加的结果
	 */
	boolean save(Schedule schedule);

	/**
	 * 搜索比赛日程
	 * 
	 * @param name
	 *            试图搜索的比赛队伍
	 * @return 该球队的Schedule实例
	 */
	Iterator<Schedule> searchByTeam(String team);

	/**
	 * 搜索全部比赛日程
	 * 
	 * @return 全部比赛日程的Iterator
	 */
	Iterator<Schedule> searchAllSchedule();
}
