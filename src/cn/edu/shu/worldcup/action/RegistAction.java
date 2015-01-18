package cn.edu.shu.worldcup.action;

import cn.edu.shu.worldcup.domain.User;
import cn.edu.shu.worldcup.service.RegistService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 处理用户注册
 * 
 * @author 江辰
 *
 */
@SuppressWarnings("serial")
public class RegistAction extends ActionSupport {
	private User user;
	private String reptpass;
	private RegistService registService;

	public void setRegistService(RegistService registService) {
		this.registService = registService;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public String getReptpass() {
		return reptpass;
	}

	public void setReptpass(String reptpass) {
		this.reptpass = reptpass;
	}

	public String execute() throws Exception {
		if (registService.regist(user)) {
			return SUCCESS;
		} else {
			return ERROR;
		}
	}

}
