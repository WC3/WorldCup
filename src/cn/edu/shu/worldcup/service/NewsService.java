package cn.edu.shu.worldcup.service;

import java.util.Iterator;

import cn.edu.shu.worldcup.domain.News;

/**
 * 新闻相关的业务逻辑
 * @author 陈超
 *
 */
public interface NewsService {

	/**
	 * 添加新的新闻
	 * 
	 * @param news
	 *            试图添加的News实例
	 * @return 添加的结果
	 */
	boolean save(News news);
	
	/**
	 * 根据标题查找新闻
	 * @param title
	 * @return
	 */
	Iterator<News> searchByTitle(String title);
	
	/**
	 * 根据新闻id查找新闻
	 * @param id
	 * @return
	 */
	News searchById(Integer id);	
	
	/**
	 * 查看所有新闻
	 * @return
	 */
	Iterator<News> searchAllNews();
}
