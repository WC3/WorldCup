package cn.edu.shu.worldcup.service.impl;

import cn.edu.shu.worldcup.dao.UserDao;
import cn.edu.shu.worldcup.domain.User;
import cn.edu.shu.worldcup.service.RegistService;

/**
 * 注册的业务逻辑
 * 
 * @author 江辰
 *
 */
public class RegistServiceImpl implements RegistService {
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	/**
	 * 判断是否注册成功
	 * 
	 * @param user
	 *            试图注册的User实例
	 * @return 注册的结果
	 */
	@Override
	public boolean regist(User user) {
		int result = userDao.save(user);
		if (result > 0) {
			return true;
		}
		return false;
	}

}
