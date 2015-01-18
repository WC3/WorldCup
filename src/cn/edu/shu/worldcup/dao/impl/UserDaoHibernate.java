package cn.edu.shu.worldcup.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.edu.shu.worldcup.dao.UserDao;
import cn.edu.shu.worldcup.domain.User;

/**
 * 提供对User的CRUD操作
 * 
 * @author 江辰
 *
 */
public class UserDaoHibernate extends HibernateDaoSupport implements UserDao {
	/**
	 * 根据标识属性来加载User实例
	 * 
	 * @param id
	 *            需要加载的User实例的标识属性值
	 * @return 指定标识属性对应的User实例
	 */
	@Override
	public User get(Integer id) {
		return getHibernateTemplate().get(User.class, id);
	}

	/**
	 * 持久化指定的User实例
	 * 
	 * @param user
	 *            需要被持久化的User实例
	 * @return User实例被持久化后的标识属性值
	 */
	@Override
	public Integer save(User user) {
		return (Integer) getHibernateTemplate().save(user);
	}

	/**
	 * 修改指定的User实例
	 * 
	 * @param user
	 *            需要被修改的User实例
	 */
	@Override
	public void update(User user) {
		getHibernateTemplate().update(user);
	}

	/**
	 * 删除指定的User实例
	 * 
	 * @param id
	 *            需要被删除的User实例的标识属性值
	 */
	@Override
	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}

	/**
	 * 删除指定的User实例
	 * 
	 * @param user
	 *            需要被删除的User实例
	 */
	@Override
	public void delete(User user) {
		getHibernateTemplate().delete(user);
	}

	/**
	 * 根据用户名查询User实例
	 * 
	 * @param name
	 *            需要查询的User用户名
	 * @return 该用户名对应的User实例
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<User> findByName(String name) {
		return (List<User>) getHibernateTemplate().find(
				"from User u where u.name = ?", name);
	}

	/**
	 * 根据用户名和密码查询User实例
	 * 
	 * @param name
	 *            需要查询的User用户名
	 * @param pass
	 *            需要查询的User密码
	 * @return 该用户名和密码对应的User实例
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<User> findByNameAndPass(String name, String pass) {
		return (List<User>) getHibernateTemplate().find(
				"from User u where u.name = ? and u.pass = ?", name, pass);
	}

	/**
	 * 查询全部的User实例
	 * 
	 * @return 数据库中全部的User实例
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAllUser() {
		return (List<User>) getHibernateTemplate().find("from User");
	}

}
