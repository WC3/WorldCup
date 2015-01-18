package cn.edu.shu.worldcup.dao;

import java.util.List;

import cn.edu.shu.worldcup.domain.News;

/**
 * 提供对news的CRUD操作
 * @author 陈超
 *
 */
public interface NewsDao {

	/**
	 * 根据标识属性来加载News实例
	 * 
	 * @param id
	 * 			需要加载的News实例的标识属性值
	 * @return	指定标识属性对应的News实例
	 */
	News get(Integer id);
	
	/**
	 * 持久化指定的News实例
	 * 
	 * @param news
	 *            需要被持久化的News实例
	 * @return News实例被持久化后的标识属性值
	 */
	Integer save(News news);
	
	/**
	 * 修改指定的News实例
	 * 
	 * @param news
	 *            需要被修改的News实例
	 */
	void update(News news);
	
	/**
	 * 删除指定的News实例
	 * 
	 * @param id
	 *            需要被删除的News实例的标识属性值
	 */
	void delete(Integer id);
	
	/**
	 * 删除指定的News实例
	 * 
	 * @param news
	 *            需要被删除的News实例
	 */
	void delete(News news);
	
	/**
	 * 根据标题关键字查找新闻
	 * @param title
	 * 				需要查找的标题的关键字
	 * @return		查询的一系列结果标题
	 */
	public List<News> findByTitle(String title);
	
	/**
	 * 根据新闻id查询实例
	 * 
	 * @param id
	 *            需要查询的新闻id
	 * @return 该球员的News实例
	 */
	public List<News> findById(Integer id);
	
	/**
	 * 查询所有新闻
	 * @return	数据库中全部News实例
	 */
	public List<News> findAllNews();
}
