package cn.edu.shu.worldcup.service.impl;

import java.util.List;

import cn.edu.shu.worldcup.dao.UserDao;
import cn.edu.shu.worldcup.domain.User;
import cn.edu.shu.worldcup.service.LoginService;

/**
 * 登录的业务逻辑
 * 
 * @author 江辰
 *
 */
public class LoginServiceImpl implements LoginService {
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	/**
	 * 判断是否登录成功，返回null为登录失败
	 * 
	 * @param user
	 *            试图登录的User实例
	 * @return 试图登录的User实例或null
	 */
	@Override
	public User login(User user) {
		List<User> ul = userDao.findByNameAndPass(user.getName(),
				user.getPass());
		if (ul.isEmpty()) {
			return null;
		} else {
			return ul.iterator().next();
		}
	}

}
