package cn.edu.shu.worldcup.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

/**
 * 处理用户注销
 * 
 * @author 江辰
 *
 */
public class LogoutAction implements Action {

	@Override
	public String execute() throws Exception {
		ActionContext.getContext().getSession().put("username", null);
		return SUCCESS;
	}

}
