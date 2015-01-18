package cn.edu.shu.worldcup.service;

import cn.edu.shu.worldcup.domain.User;

/**
 * 登录的业务逻辑
 * 
 * @author 江辰
 *
 */
public interface LoginService {
	/**
	 * 判断是否登录成功，返回null为登录失败
	 * 
	 * @param user
	 *            试图登录的User实例
	 * @return 试图登录的User实例或null
	 */
	User login(User user);

}
