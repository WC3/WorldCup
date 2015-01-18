package cn.edu.shu.worldcup.service.impl;

import java.util.Iterator;

import cn.edu.shu.worldcup.dao.CommentsDao;
import cn.edu.shu.worldcup.domain.Comments;
import cn.edu.shu.worldcup.service.CommentsService;

public class CommentsServiceImpl implements CommentsService{

	private CommentsDao commentsDao;
	
	public void setCommentsDao(CommentsDao commentsDao) {
		this.commentsDao = commentsDao;
	}

	/**
	 * 添加新的评论
	 * 
	 * @param comments
	 *            试图添加的Comments实例
	 * @return 添加的结果
	 */
	public boolean save(Comments comments) {
		Integer result = commentsDao.save(comments);
		if (result > 0) {
			return true;
		}
		return false;
	}

	/**
	 * 根据新闻id查询Comments实例
	 * @param newsId
	 * 				需要查询的新闻id
	 * @return 返回对应新闻的所有Comments实例
	 */
	public Iterator<Comments> searchByNewsId(Integer newsId) {
		Iterator<Comments> it = commentsDao.findByNewsId(newsId).iterator();
		if(it != null) {
			return it;
		} else {
			return null;
		}
	}

}
