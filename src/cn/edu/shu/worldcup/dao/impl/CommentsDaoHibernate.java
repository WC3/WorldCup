package cn.edu.shu.worldcup.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.edu.shu.worldcup.dao.CommentsDao;
import cn.edu.shu.worldcup.domain.Comments;

public class CommentsDaoHibernate extends HibernateDaoSupport implements CommentsDao{

	public Comments get(Integer id) {
		return getHibernateTemplate().get(Comments.class, id);
	}

	/**
	 * 存入评论
	 */
	public Integer save(Comments comments) {
		return (Integer) getHibernateTemplate().save(comments);
	}

	public void update(Comments comments) {
		getHibernateTemplate().update(comments);
	}

	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}

	public void delete(Comments comments) {
		getHibernateTemplate().delete(comments);
	}

	/**
	 * 根据新闻id查询相关Comments实例
	 */
	@SuppressWarnings("unchecked")
	public List<Comments> findByNewsId(Integer newsId) {
		return (List<Comments>) getHibernateTemplate().find(
				"from Comments as t where t.newsId=?", newsId);
	}

}
