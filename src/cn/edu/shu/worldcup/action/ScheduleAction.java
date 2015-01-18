package cn.edu.shu.worldcup.action;

import java.util.Iterator;

import com.opensymphony.xwork2.Action;

import cn.edu.shu.worldcup.domain.Schedule;
import cn.edu.shu.worldcup.service.ScheduleService;

/**
 * 处理比赛日程搜索
 * @author 陈超
 *
 */
public class ScheduleAction implements Action{
	private Iterator<Schedule> it4;
	private Schedule schedule;
	private ScheduleService scheduleService;
	private Boolean flag;

	public Iterator<Schedule> getIt4() {
		return it4;
	}

	public void setIt4(Iterator<Schedule> it4) {
		this.it4 = it4;
	}

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	public ScheduleService getScheduleService() {
		return scheduleService;
	}

	public void setScheduleService(ScheduleService scheduleService) {
		this.scheduleService = scheduleService;
	}

	public Boolean getFlag() {
		return flag;
	}

	public void setFlag(Boolean flag) {
		this.flag = flag;
	}

	public String execute() throws Exception {
		it4 = scheduleService.searchByTeam(schedule.getSessions());
		if (schedule == null) {
			setFlag(false);
			return ERROR;
		} else {
			setFlag(true);
			return SUCCESS;
		}
	}

}
