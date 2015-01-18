package cn.edu.shu.worldcup.dao;

import java.util.List;

import cn.edu.shu.worldcup.domain.Comments;

/**
 * 提供对Comments的CRUD操作
 * @author 陈超
 *
 */
public interface CommentsDao {

	/**
	 * 根据标识属性来加载Comments实例
	 * 
	 * @param id
	 *            需要加载的Comments实例的标识属性值
	 * @return 指定标识属性对应的Comments实例
	 */
	Comments get(Integer id);
	
	/**
	 * 持久化指定的Comments实例
	 * 
	 * @param comments
	 *            需要被持久化的Comments实例
	 * @return Comments实例被持久化后的标识属性值
	 */
	Integer save(Comments comments);
	
	/**
	 * 修改指定的Comments实例
	 * 
	 * @param comments
	 *            需要被修改的Comments实例
	 */
	void update(Comments comments);
	
	/**
	 * 删除指定的Comments实例
	 * 
	 * @param id
	 *            需要被删除的Comments实例的标识属性值
	 */
	void delete(Integer id);
	
	/**
	 * 删除指定的Comments实例
	 * 
	 * @param comments
	 *            需要被删除的Comments实例
	 */
	void delete(Comments comments);
	
	/**
	 * 根据新闻id查询相关的Comments实例
	 * 
	 * @param newsId
	 *            需要查询的新闻的id
	 * @return 该新闻的相关的Comments
	 */
	public List<Comments> findByNewsId(Integer newsId);
}
