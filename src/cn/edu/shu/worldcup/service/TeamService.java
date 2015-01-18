package cn.edu.shu.worldcup.service;

import java.util.Iterator;

import cn.edu.shu.worldcup.domain.Team;

/**
 * 球队相关的业务逻辑
 * 
 * @author 江辰
 *
 */
public interface TeamService {
	/**
	 * 添加新的球队
	 * 
	 * @param team
	 *            试图添加的Team实例
	 * @return 添加的结果
	 */
	boolean save(Team team);

	/**
	 * 搜索球队
	 * 
	 * @param name
	 *            试图搜索的球队名称
	 * @return 该球队的Team实例
	 */
	Team searchByName(String name);

	/**
	 * 搜索全部球队
	 * 
	 * @return 全部球队的Iterator
	 */
	Iterator<Team> searchAllTeam();

}
