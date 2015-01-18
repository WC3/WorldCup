package cn.edu.shu.worldcup.action;

import java.util.Iterator;

import cn.edu.shu.worldcup.domain.Team;
import cn.edu.shu.worldcup.service.TeamService;

import com.opensymphony.xwork2.Action;

/**
 * 处理查看全部球队
 * 
 * @author 江辰
 *
 */
public class TeamAllAction implements Action {
	private Iterator<Team> it;
	private TeamService teamService;

	public Iterator<Team> getIt() {
		return it;
	}

	public void setIt(Iterator<Team> it) {
		this.it = it;
	}

	public void setTeamService(TeamService teamService) {
		this.teamService = teamService;
	}

	@Override
	public String execute() throws Exception {
		setIt(teamService.searchAllTeam());
		return SUCCESS;
	}
}
