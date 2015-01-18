package cn.edu.shu.worldcup.service.impl;

import java.util.List;

import cn.edu.shu.worldcup.dao.UserDao;
import cn.edu.shu.worldcup.domain.User;
import cn.edu.shu.worldcup.service.DemoService;

public class DemoServiceImpl implements DemoService{
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public int getId(String name) {
		List<User> ul = userDao.findByName(name);
		User user = ul.iterator().next();
		return user.getId();
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}
	@Override
	public void delete(User user) {
		userDao.delete(user);
	}
}
