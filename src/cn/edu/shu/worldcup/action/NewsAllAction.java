package cn.edu.shu.worldcup.action;

import java.util.Iterator;

import cn.edu.shu.worldcup.domain.News;
import cn.edu.shu.worldcup.service.NewsService;

import com.opensymphony.xwork2.Action;

public class NewsAllAction implements Action{

	private Iterator<News> it;
	private NewsService newsService;

	public Iterator<News> getIt() {
		return it;
	}

	public void setIt(Iterator<News> it) {
		this.it = it;
	}

	public void setNewsService(NewsService newsService) {
		this.newsService = newsService;
	}

	@Override
	public String execute() throws Exception {
		setIt(newsService.searchAllNews());
		return SUCCESS;
	}

}
