package cn.edu.shu.worldcup.action;

import java.util.Iterator;

import cn.edu.shu.worldcup.domain.Comments;
import cn.edu.shu.worldcup.domain.News;
import cn.edu.shu.worldcup.service.CommentsService;
import cn.edu.shu.worldcup.service.NewsService;

import com.opensymphony.xwork2.Action;

/**
 * 处理新闻搜索
 * @author Administrator
 *
 */
public class NewsAction implements Action{

	private Iterator<News>  it4;
	private News news;
	private  Iterator<Comments> it3;
	private CommentsService commentsService;
	private NewsService newsService;
	private Boolean flag;
	
	public Iterator<News> getIt4() {
		return it4;
	}

	public void setIt4(Iterator<News> it4) {
		this.it4 = it4;
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
		it4 = newsService.searchByTitle(news.getTitle());
		setIt3(commentsService.searchByNewsId(news.getId()));
		if (news == null) {
			setFlag(false);
			return ERROR;
		} else {
			setFlag(true);
			return SUCCESS;
		}
	}

}
