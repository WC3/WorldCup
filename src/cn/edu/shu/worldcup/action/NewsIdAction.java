package cn.edu.shu.worldcup.action;


import java.util.Iterator;

import cn.edu.shu.worldcup.domain.Comments;
import cn.edu.shu.worldcup.domain.News;
import cn.edu.shu.worldcup.service.CommentsService;
import cn.edu.shu.worldcup.service.NewsService;

import com.opensymphony.xwork2.Action;

public class NewsIdAction implements Action{

	private News news;
	private  Iterator<Comments> it3;
	private CommentsService commentsService;
	private NewsService newsService;
	private Boolean flag;
	//点击的新闻id
	private Integer number;
	
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Iterator<Comments> getIt3() {
		return it3;
	}

	public void setIt3(Iterator<Comments> it3) {
		this.it3 = it3;
	}

	public CommentsService getCommentsService() {
		return commentsService;
	}

	public void setCommentsService(CommentsService commentsService) {
		this.commentsService = commentsService;
	}

	public News getNews() {
		return news;
	}

	public void setNews(News news) {
		this.news = news;
	}

	public NewsService getNewsService() {
		return newsService;
	}

	public void setNewsService(NewsService newsService) {
		this.newsService = newsService;
	}

	public Boolean getFlag() {
		return flag;
	}

	public void setFlag(Boolean flag) {
		this.flag = flag;
	}

	@Override
	public String execute() throws Exception {
		news = newsService.searchById(number);
		setIt3(commentsService.searchByNewsId(number));
		if (news == null) {
			setFlag(false);
			return ERROR;
		} else {
			setFlag(true);
			return SUCCESS;
		}
	}

}
