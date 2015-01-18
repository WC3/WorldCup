package cn.edu.shu.worldcup.service.impl;

import java.util.Iterator;

import cn.edu.shu.worldcup.dao.TeamDao;
import cn.edu.shu.worldcup.domain.Team;
import cn.edu.shu.worldcup.service.TeamService;

/**
 * 球队相关的业务逻辑
 * 
 * @author 江辰
 *
 */
public class TeamServiceImpl implements TeamService {
	private TeamDao teamDao;

	public void setTeamDao(TeamDao teamDao) {
		this.teamDao = teamDao;
	}

	/**
	 * 添加新的球队
	 * 
	 * @param team
	 *            试图添加的Team实例
	 * @return 添加的结果
	 */
	@Override
	public boolean save(Team team) {
		Integer result = teamDao.save(team);
		if (result > 0) {
			return true;
		}
		return false;
	}

	/**
	 * 搜索球队
	 * 
	 * @param name
	 *            试图搜索的球队名称
	 * @return 该球队的Team实例
	 */
	@Override
	public Team searchByName(String name) {
		Iterator<Team> it = teamDao.findByName(name).iterator();
		if (it.hasNext()) {
			return it.next();
		} else {
			return null;
		}
	}

	/**
	 * 搜索全部球队
	 * 
	 * @return 全部球队的Iterator
	 */
	@Override
	public Iterator<Team> searchAllTeam() {
		return teamDao.findAllTeam().iterator();
	}

}
