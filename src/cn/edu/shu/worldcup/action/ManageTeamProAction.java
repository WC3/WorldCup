package cn.edu.shu.worldcup.action;

import cn.edu.shu.worldcup.domain.Team;
import cn.edu.shu.worldcup.service.TeamService;

import com.opensymphony.xwork2.Action;

/**
 * 处理后台添加球队
 * 
 * @author 江辰
 *
 */
public class ManageTeamProAction implements Action {
	private Team team;
	private TeamService teamService;

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public void setTeamService(TeamService teamService) {
		this.teamService = teamService;
	}

	@Override
	public String execute() throws Exception {
		if (teamService.save(getTeam())) {
			return SUCCESS;
		} else {
			return ERROR;
		}
	}

}
