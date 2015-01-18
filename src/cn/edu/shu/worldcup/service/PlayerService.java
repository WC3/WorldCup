package cn.edu.shu.worldcup.service;

import java.util.Iterator;

import cn.edu.shu.worldcup.domain.Player;

/**
 * 球员相关的业务逻辑
 * 
 * @author 江辰
 *
 */
public interface PlayerService {
	/**
	 * 添加新的球员
	 * 
	 * @param player
	 *            试图添加的Player实例
	 * @return 添加的结果
	 */
	boolean save(Player player);

	/**
	 * 搜索球员
	 * 
	 * @param name
	 *            试图搜索的球员姓名
	 * @return 该球员的Player实例
	 */
	Player searchByName(String name);

	/**
	 * 搜索全部球员
	 * 
	 * @return 全部球员的Iterator
	 */
	Iterator<Player> searchAllPlayer();

	/**
	 * 搜索全部球员，以进球数逆序排序
	 * 
	 * @return 全部球员的Iterator
	 */
	Iterator<Player> searchOrderByGoals();

	/**
	 * 搜索全部球员，以助攻数逆序排序
	 * 
	 * @return 全部球员的Iterator
	 */
	Iterator<Player> searchOrderByAssists();

	/**
	 * 搜索全部球员，以射门数逆序排序
	 * 
	 * @return 全部球员的Iterator
	 */
	Iterator<Player> searchOrderByShooting();

	/**
	 * 搜索全部球员，以传球数逆序排序
	 * 
	 * @return 全部球员的Iterator
	 */
	Iterator<Player> searchOrderByPassing();

	/**
	 * 搜索全部球员，以触球数逆序排序
	 * 
	 * @return 全部球员的Iterator
	 */
	Iterator<Player> searchOrderByBall();

	/**
	 * 搜索全部球员，以犯规数逆序排序
	 * 
	 * @return 全部球员的Iterator
	 */
	Iterator<Player> searchOrderByFoul();

	/**
	 * 搜索全部球员，以封堵数逆序排序
	 * 
	 * @return 全部球员的Iterator
	 */
	Iterator<Player> searchOrderByClosure();

	/**
	 * 搜索全部球员，以黄牌数逆序排序
	 * 
	 * @return 全部球员的Iterator
	 */
	Iterator<Player> searchOrderByYellow();

	/**
	 * 搜索全部球员，以红牌数逆序排序
	 * 
	 * @return 全部球员的Iterator
	 */
	Iterator<Player> searchOrderByRed();

	/**
	 * 获取球员数量
	 * 
	 * @return 球员数量
	 */
	long getPlayerNumber();

}
