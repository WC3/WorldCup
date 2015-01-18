package cn.edu.shu.worldcup.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.edu.shu.worldcup.dao.NewsDao;
import cn.edu.shu.worldcup.domain.News;

public class NewsDaoHibernate extends HibernateDaoSupport implements NewsDao{

	public News get(Integer id) {
		return getHibernateTemplate().get(News.class, id);
	}

	public Integer save(News news) {
		return (Integer) getHibernateTemplate().save(news);
	}

	public void update(News news) {
		getHibernateTemplate().update(news);
	}

	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}

	public void delete(News news) {
		getHibernateTemplate().delete(news);
	}

	/**
	 * 根据新闻标题查询新闻
	 */
	@SuppressWarnings("unchecked")
	public List<News> findByTitle(String title) {
		return (List<News>) getHibernateTemplate().find(
				"from News t where t.title like ?", "%" + title + "%");
	}

	/**
	 * 根据新闻id查询新闻
	 */
	@SuppressWarnings("unchecked")
	public List<News> findById(Integer id) {
		return (List<News>) getHibernateTemplate().find(
				"from News t where t.id = ?", id);
	}
	
	/**
	 * 查询所有新闻,根据新闻id逆序
	 */
	@SuppressWarnings("unchecked")
	public List<News> findAllNews() {
		return (List<News>) getHibernateTemplate().find(
				"from News t order by t.id desc");
	}

}
