package cn.edu.shu.worldcup.dao;

import java.util.List;

import cn.edu.shu.worldcup.domain.Player;

/**
 * 提供对Player的CRUD操作
 * 
 * @author 江辰
 *
 */
public interface PlayerDao {
	/**
	 * 根据标识属性来加载Player实例
	 * 
	 * @param id
	 *            需要加载的Player实例的标识属性值
	 * @return 指定标识属性对应的Player实例
	 */
	Player get(Integer id);

	/**
	 * 持久化指定的Player实例
	 * 
	 * @param player
	 *            需要被持久化的Player实例
	 * @return Player实例被持久化后的标识属性值
	 */
	Integer save(Player player);

	/**
	 * 修改指定的Player实例
	 * 
	 * @param player
	 *            需要被修改的Player实例
	 */
	void update(Player player);

	/**
	 * 删除指定的Player实例
	 * 
	 * @param id
	 *            需要被删除的Player实例的标识属性值
	 */
	void delete(Integer id);

	/**
	 * 删除指定的Player实例
	 * 
	 * @param player
	 *            需要被删除的Player实例
	 */
	void delete(Player player);

	/**
	 * 根据名字查询Player实例
	 * 
	 * @param name
	 *            需要查询的球员名字
	 * @return 该球员的Player实例
	 */
	public List<Player> findByName(String name);

	/**
	 * 查询全部的Player实例
	 * 
	 * @return 数据库中全部的Player实例
	 */
	public List<Player> findAllPlayer();

	/**
	 * 查询全部的Player实例，以进球数逆序排序
	 * 
	 * @return 数据库中全部的Player实例
	 */
	public List<Player> findOrderByGoals();

	/**
	 * 查询全部的Player实例，以助攻数逆序排序
	 * 
	 * @return 数据库中全部的Player实例
	 */
	public List<Player> findOrderByAssists();

	/**
	 * 查询全部的Player实例，以射门数逆序排序
	 * 
	 * @return 数据库中全部的Player实例
	 */
	public List<Player> findOrderByShooting();

	/**
	 * 查询全部的Player实例，以传球数逆序排序
	 * 
	 * @return 数据库中全部的Player实例
	 */
	public List<Player> findOrderByPassing();

	/**
	 * 查询全部的Player实例，以触球数逆序排序
	 * 
	 * @return 数据库中全部的Player实例
	 */
	public List<Player> findOrderByBall();

	/**
	 * 查询全部的Player实例，以犯规数逆序排序
	 * 
	 * @return 数据库中全部的Player实例
	 */
	public List<Player> findOrderByFoul();

	/**
	 * 查询全部的Player实例，以封堵数逆序排序
	 * 
	 * @return 数据库中全部的Player实例
	 */
	public List<Player> findOrderByClosure();

	/**
	 * 查询全部的Player实例，以黄牌数逆序排序
	 * 
	 * @return 数据库中全部的Player实例
	 */
	public List<Player> findOrderByYellow();

	/**
	 * 查询全部的Player实例，以红牌数逆序排序
	 * 
	 * @return 数据库中全部的Player实例
	 */
	public List<Player> findOrderByRed();

	/**
	 * 查询全部的Player实例
	 * 
	 * @return 数据库中全部的Player实例
	 */
	public long getPlayerNumber();

}
