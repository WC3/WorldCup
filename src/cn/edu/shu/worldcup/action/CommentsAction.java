package cn.edu.shu.worldcup.action;

import com.opensymphony.xwork2.Action;

import cn.edu.shu.worldcup.domain.Comments;
import cn.edu.shu.worldcup.service.CommentsService;

public class CommentsAction implements Action {

	private Comments comments;
	private CommentsService commentsService;
	
	public Comments getComments() {
		return comments;
	}
	public void setComments(Comments comments) {
		this.comments = comments;
	}
	public CommentsService getCommentsService() {
		return commentsService;
	}
	public void setCommentsService(CommentsService commentsService) {
		this.commentsService = commentsService;
	}

	/**
	 * 添加评论
	 */
	public String execute() throws Exception {
		if(commentsService.save(comments)) {
			return SUCCESS;
		} else {
			return ERROR;
		}
	}
	
	
}
