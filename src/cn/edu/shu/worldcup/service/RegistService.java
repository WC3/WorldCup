package cn.edu.shu.worldcup.service;

import cn.edu.shu.worldcup.domain.User;

/**
 * 注册的业务逻辑
 * 
 * @author 江辰
 *
 */
public interface RegistService {
	/**
	 * 判断是否注册成功
	 * 
	 * @param user
	 *            试图注册的User实例
	 * @return 注册的结果
	 */
	boolean regist(User user);

}
