package cn.edu.shu.worldcup.service;

import java.util.Iterator;

import cn.edu.shu.worldcup.domain.Comments;

/**
 * 评论相关业务逻辑
 * @author 陈超
 *
 */
public interface CommentsService {

	/**
	 * 添加新的评论
	 * 
	 * @param comments
	 *            试图添加的Comments实例
	 * @return 添加的结果
	 */
	boolean save(Comments comments);
	
	/**
	 * 根据新闻id查看相关评论
	 * @param newsId新闻id
	 * @return
	 */
	Iterator<Comments> searchByNewsId(Integer newsId);
}
