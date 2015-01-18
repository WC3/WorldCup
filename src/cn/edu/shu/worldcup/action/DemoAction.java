package cn.edu.shu.worldcup.action;

import cn.edu.shu.worldcup.domain.User;
import cn.edu.shu.worldcup.service.DemoService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class DemoAction implements Action {
	private User user;
	private DemoService demoService;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setDemoService(DemoService demoService) {
		this.demoService = demoService;
	}

	
	public String goupdate() throws Exception {
		user.setId(demoService.getId(user.getName()));
		demoService.update(user);
		ActionContext.getContext().getSession()
		.put("useremail", user.getEmail());

		return SUCCESS;
	}
	public String godelete() throws Exception {
		user.setId(demoService.getId(user.getName()));
		demoService.delete(user);
		return SUCCESS;
	}
	@Override
	public String execute() throws Exception
	{
		return SUCCESS;
	}
}
