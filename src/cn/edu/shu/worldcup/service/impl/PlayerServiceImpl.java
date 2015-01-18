package cn.edu.shu.worldcup.service.impl;

import java.util.Iterator;

import cn.edu.shu.worldcup.dao.PlayerDao;
import cn.edu.shu.worldcup.domain.Player;
import cn.edu.shu.worldcup.service.PlayerService;

/**
 * 球员相关的业务逻辑
 * 
 * @author 江辰
 *
 */
public class PlayerServiceImpl implements PlayerService {
	private PlayerDao playerDao;

	public void setPlayerDao(PlayerDao playerDao) {
		this.playerDao = playerDao;
	}

	/**
	 * 添加新的球员
	 * 
	 * @param player
	 *            试图添加的Player实例
	 * @return 添加的结果
	 */
	@Override
	public boolean save(Player player) {
		int result = playerDao.save(player);
		if (result > 0) {
			return true;
		}
		return false;
	}

	/**
	 * 搜索球员
	 * 
	 * @param name
	 *            试图搜索的球员姓名
	 * @return 该球员的Player实例
	 */
	@Override
	public Player searchByName(String name) {
		Iterator<Player> it = playerDao.findByName(name).iterator();
		if (it.hasNext()) {
			return it.next();
		} else {
			return null;
		}
	}

	/**
	 * 搜索全部球员
	 * 
	 * @return 全部球员的Iterator
	 */
	@Override
	public Iterator<Player> searchAllPlayer() {
		return playerDao.findAllPlayer().iterator();
	}

	/**
	 * 搜索全部球员，以进球数逆序排序
	 * 
	 * @return 全部球员的Iterator
	 */
	@Override
	public Iterator<Player> searchOrderByGoals() {
		return playerDao.findOrderByGoals().iterator();
	}

	/**
	 * 搜索全部球员，以助攻数逆序排序
	 * 
	 * @return 全部球员的Iterator
	 */
	@Override
	public Iterator<Player> searchOrderByAssists() {
		return playerDao.findOrderByAssists().iterator();
	}

	/**
	 * 搜索全部球员，以射门数逆序排序
	 * 
	 * @return 全部球员的Iterator
	 */
	@Override
	public Iterator<Player> searchOrderByShooting() {
		return playerDao.findOrderByShooting().iterator();
	}

	/**
	 * 搜索全部球员，以传球数逆序排序
	 * 
	 * @return 全部球员的Iterator
	 */
	@Override
	public Iterator<Player> searchOrderByPassing() {
		return playerDao.findOrderByPassing().iterator();
	}

	/**
	 * 搜索全部球员，以触球数逆序排序
	 * 
	 * @return 全部球员的Iterator
	 */
	@Override
	public Iterator<Player> searchOrderByBall() {
		return playerDao.findOrderByBall().iterator();
	}

	/**
	 * 搜索全部球员，以犯规数逆序排序
	 * 
	 * @return 全部球员的Iterator
	 */
	@Override
	public Iterator<Player> searchOrderByFoul() {
		return playerDao.findOrderByFoul().iterator();
	}

	/**
	 * 搜索全部球员，以封堵数逆序排序
	 * 
	 * @return 全部球员的Iterator
	 */
	@Override
	public java.util.Iterator<Player> searchOrderByClosure() {
		return playerDao.findOrderByClosure().iterator();
	}

	/**
	 * 搜索全部球员，以黄牌数逆序排序
	 * 
	 * @return 全部球员的Iterator
	 */
	@Override
	public Iterator<Player> searchOrderByYellow() {
		return playerDao.findOrderByYellow().iterator();
	}

	/**
	 * 搜索全部球员，以红牌数逆序排序
	 * 
	 * @return 全部球员的Iterator
	 */
	@Override
	public Iterator<Player> searchOrderByRed() {
		return playerDao.findOrderByRed().iterator();
	}

	/**
	 * 获取球员数量
	 * 
	 * @return 球员数量
	 */
	@Override
	public long getPlayerNumber() {
		return playerDao.getPlayerNumber();
	}

}
