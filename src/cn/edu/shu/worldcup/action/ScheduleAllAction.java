package cn.edu.shu.worldcup.action;

import java.util.Iterator;

import com.opensymphony.xwork2.Action;

import cn.edu.shu.worldcup.domain.Schedule;
import cn.edu.shu.worldcup.service.ScheduleService;

public class ScheduleAllAction implements Action{
	private Iterator<Schedule> it;
	private ScheduleService scheduleService;
	
	public Iterator<Schedule> getIt() {
		return it;
	}

	public void setIt(Iterator<Schedule> it) {
		this.it = it;
	}

	public void setScheduleService(ScheduleService scheduleService) {
		this.scheduleService = scheduleService;
	}

	@Override
	public String execute() throws Exception {
		setIt(scheduleService.searchAllSchedule());
		return SUCCESS;
	}

}
