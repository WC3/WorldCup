package cn.edu.shu.worldcup.service.impl;

import java.util.Iterator;

import cn.edu.shu.worldcup.dao.ScheduleDao;
import cn.edu.shu.worldcup.domain.Schedule;
import cn.edu.shu.worldcup.service.ScheduleService;

public class ScheduleServiceImpl implements ScheduleService {

	public ScheduleDao scheduleDao;
	
	public void setScheduleDao(ScheduleDao scheduleDao) {
		this.scheduleDao = scheduleDao;
	}

	@Override
	public boolean save(Schedule schedule) {
		Integer result = scheduleDao.save(schedule);
		if (result > 0) {
			return true;
		}
		return false;
	}

	/**
	 * 根据比赛队伍名字查询相关Schedule实例
	 * @param team
	 * 			需要查询的比赛的队伍名字
	 * @return 	返回查询到的所有相关比赛日程Schedule实例
	 */
	@Override
	public Iterator<Schedule> searchByTeam(String team) {
		Iterator<Schedule> it = scheduleDao.findByTeam(team).iterator();
		if (it != null) {
			return it;
		} else {
			return null;
		}
	}

	/**
	 * 查询数据中Schedule所有实例
	 */
	@Override
	public Iterator<Schedule> searchAllSchedule() {
		return scheduleDao.findAllSchedule().iterator();
	}
}
