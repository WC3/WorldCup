package cn.edu.shu.worldcup.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.edu.shu.worldcup.dao.PlayerDao;
import cn.edu.shu.worldcup.domain.Player;

/**
 * 提供对Player的CRUD操作
 * 
 * @author 江辰
 *
 */
public class PlayerDaoHibernate extends HibernateDaoSupport implements
		PlayerDao {
	/**
	 * 根据标识属性来加载Player实例
	 * 
	 * @param id
	 *            需要加载的Player实例的标识属性值
	 * @return 指定标识属性对应的Player实例
	 */
	@Override
	public Player get(Integer id) {
		return getHibernateTemplate().get(Player.class, id);
	}

	/**
	 * 持久化指定的Player实例
	 * 
	 * @param player
	 *            需要被持久化的Player实例
	 * @return Player实例被持久化后的标识属性值
	 */
	@Override
	public Integer save(Player player) {
		return (Integer) getHibernateTemplate().save(player);
	}

	/**
	 * 修改指定的Player实例
	 * 
	 * @param player
	 *            需要被修改的Player实例
	 */
	@Override
	public void update(Player player) {
		getHibernateTemplate().update(player);
	}

	/**
	 * 删除指定的Player实例
	 * 
	 * @param id
	 *            需要被删除的Player实例的标识属性值
	 */
	@Override
	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}

	/**
	 * 删除指定的Player实例
	 * 
	 * @param player
	 *            需要被删除的Player实例
	 */
	@Override
	public void delete(Player player) {
		getHibernateTemplate().delete(player);
	}

	/**
	 * 根据名字查询Player实例
	 * 
	 * @param name
	 *            需要查询的球员名字
	 * @return 该球员的Player实例
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Player> findByName(String name) {
		return (List<Player>) getHibernateTemplate().find(
				"from Player p where p.name = ?", name);
	}

	/**
	 * 查询全部的Player实例
	 * 
	 * @return 数据库中全部的Player实例
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Player> findAllPlayer() {
		return (List<Player>) getHibernateTemplate().find("from Player");
	}

	/**
	 * 查询全部的Player实例，以进球数逆序排序
	 * 
	 * @return 数据库中全部的Player实例
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Player> findOrderByGoals() {
		return (List<Player>) getHibernateTemplate().find(
				"from Player p order by p.goals desc");
	}

	/**
	 * 查询全部的Player实例，以助攻数逆序排序
	 * 
	 * @return 数据库中全部的Player实例
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Player> findOrderByAssists() {
		return (List<Player>) getHibernateTemplate().find(
				"from Player p order by p.assists desc");
	}

	/**
	 * 查询全部的Player实例，以射门数逆序排序
	 * 
	 * @return 数据库中全部的Player实例
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Player> findOrderByShooting() {
		return (List<Player>) getHibernateTemplate().find(
				"from Player p order by p.shooting desc");
	}

	/**
	 * 查询全部的Player实例，以传球数逆序排序
	 * 
	 * @return 数据库中全部的Player实例
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Player> findOrderByPassing() {
		return (List<Player>) getHibernateTemplate().find(
				"from Player p order by p.passing desc");
	}

	/**
	 * 查询全部的Player实例，以触球数逆序排序
	 * 
	 * @return 数据库中全部的Player实例
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Player> findOrderByBall() {
		return (List<Player>) getHibernateTemplate().find(
				"from Player p order by p.ball desc");
	}

	/**
	 * 查询全部的Player实例，以触球数逆序排序
	 * 
	 * @return 数据库中全部的Player实例
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Player> findOrderByFoul() {
		return (List<Player>) getHibernateTemplate().find(
				"from Player p order by p.foul desc");
	}

	/**
	 * 查询全部的Player实例，以封堵数逆序排序
	 * 
	 * @return 数据库中全部的Player实例
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Player> findOrderByClosure() {
		return (List<Player>) getHibernateTemplate().find(
				"from Player p order by p.closure desc");
	}

	/**
	 * 查询全部的Player实例，以黄牌数逆序排序
	 * 
	 * @return 数据库中全部的Player实例
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Player> findOrderByYellow() {
		return (List<Player>) getHibernateTemplate().find(
				"from Player p order by p.yellow desc");
	}

	/**
	 * 查询全部的Player实例，以红牌数逆序排序
	 * 
	 * @return 数据库中全部的Player实例
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Player> findOrderByRed() {
		return (List<Player>) getHibernateTemplate().find(
				"from Player p order by p.red desc");
	}

	/**
	 * 查询全部的Player实例
	 * 
	 * @return 数据库中全部的Player实例
	 */
	@Override
	public long getPlayerNumber() {
		return (Long) getHibernateTemplate().find(
				"select count(*) from Player as p").get(0);
	}

}
