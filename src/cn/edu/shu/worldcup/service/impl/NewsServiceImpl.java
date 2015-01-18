package cn.edu.shu.worldcup.service.impl;

import java.util.Iterator;

import cn.edu.shu.worldcup.dao.NewsDao;
import cn.edu.shu.worldcup.domain.News;
import cn.edu.shu.worldcup.service.NewsService;

public class NewsServiceImpl implements NewsService{
	
	private NewsDao newsDao;
	
	public void setNewsDao(NewsDao newsDao) {
		this.newsDao = newsDao;
	}

	public boolean save(News news) {
		Integer result = newsDao.save(news);
		if (result > 0) {
			return true;
		}
		return false;
	}

	/**
	 * 根据新闻标题关键字查询新闻
	 * @param title
	 * 				试图查询的新闻标题的关键字
	 * @return		该标题关键字相关的新闻
	 * 
	 */
	public Iterator<News>  searchByTitle(String title) {
		Iterator<News> it = newsDao.findByTitle(title).iterator();
		if (it.hasNext()) {
			return it;
		} else {
			return null;
		}
	}

	/**
	 * 根据新闻id查询对应News实例
	 * @param id
	 * 			点击的标题对应的新闻id
	 * @return	返回查询的News实例
	 */
	public News searchById(Integer id) {
		Iterator<News> it2 = newsDao.findById(id).iterator();
		if (it2.hasNext()) {
			return it2.next();
		} else {
			return null;
		}
	}	
	
	/**
	 * 查询数据库中所有News实例
	 */
	public Iterator<News> searchAllNews() {
		return newsDao.findAllNews().iterator();
	}

}
