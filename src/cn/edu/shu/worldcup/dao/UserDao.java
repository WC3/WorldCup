package cn.edu.shu.worldcup.dao;

import java.util.List;

import cn.edu.shu.worldcup.domain.User;

/**
 * 提供对User的CRUD操作
 * 
 * @author 江辰
 *
 */
public interface UserDao {
	/**
	 * 根据标识属性来加载User实例
	 * 
	 * @param id
	 *            需要加载的User实例的标识属性值
	 * @return 指定标识属性对应的User实例
	 */
	User get(Integer id);

	/**
	 * 持久化指定的User实例
	 * 
	 * @param user
	 *            需要被持久化的User实例
	 * @return User实例被持久化后的标识属性值
	 */
	Integer save(User user);

	/**
	 * 修改指定的User实例
	 * 
	 * @param user
	 *            需要被修改的User实例
	 */
	void update(User user);

	/**
	 * 删除指定的User实例
	 * 
	 * @param id
	 *            需要被删除的User实例的标识属性值
	 */
	void delete(Integer id);

	/**
	 * 删除指定的User实例
	 * 
	 * @param user
	 *            需要被删除的User实例
	 */
	void delete(User user);

	/**
	 * 根据用户名查询User实例
	 * 
	 * @param name
	 *            需要查询的User用户名
	 * @return 该用户名对应的User实例
	 */
	public List<User> findByName(String name);

	/**
	 * 根据用户名和密码查询User实例
	 * 
	 * @param name
	 *            需要查询的User用户名
	 * @param pass
	 *            需要查询的User密码
	 * @return 该用户名和密码对应的User实例
	 */
	public List<User> findByNameAndPass(String name, String pass);

	/**
	 * 查询全部的User实例
	 * 
	 * @return 数据库中全部的User实例
	 */
	public List<User> findAllUser();


}
