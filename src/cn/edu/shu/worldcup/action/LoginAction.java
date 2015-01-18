package cn.edu.shu.worldcup.action;

import cn.edu.shu.worldcup.domain.User;
import cn.edu.shu.worldcup.service.LoginService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

/**
 * 处理用户登录
 * 
 * @author 江辰
 *
 */
public class LoginAction implements Action {
	private User user;
	private LoginService loginService;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	@Override
	public String execute() throws Exception {
		user = loginService.login(user);
		if (user == null) {
			return ERROR;
		} else {
			ActionContext.getContext().getSession()
					.put("username", user.getName());
			ActionContext.getContext().getSession()
					.put("useremail", user.getEmail());

			return SUCCESS;
		}
	}

}
