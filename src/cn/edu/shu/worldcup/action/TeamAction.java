package cn.edu.shu.worldcup.action;

import cn.edu.shu.worldcup.domain.Team;
import cn.edu.shu.worldcup.service.TeamService;

import com.opensymphony.xwork2.Action;

/**
 * 处理球队搜索
 * 
 * @author 江辰
 *
 */
public class TeamAction implements Action {
	private Team team;
	private TeamService teamService;
	private Boolean flag;

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public void setTeamService(TeamService teamService) {
		this.teamService = teamService;
	}

	public Boolean getFlag() {
		return flag;
	}

	public void setFlag(Boolean flag) {
		this.flag = flag;
	}

	@Override
	public String execute() throws Exception {
		team = teamService.searchByName(team.getName());
		if (team == null) {
			setFlag(false);
			return ERROR;
		} else {
			setFlag(true);
			return SUCCESS;
		}
	}

}
