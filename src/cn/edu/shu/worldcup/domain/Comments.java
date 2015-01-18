package cn.edu.shu.worldcup.domain;

/**
 * 评论的持久化类，包含评论的用户，评论的内容，以及评论的新闻的id
 * @author 陈超
 *
 */
public class Comments {

	//评论的唯一标识
	private Integer id;
	//评论者用户名
	private String name;
	//评论的内容
	private String content;
	//评论的新闻的id
	private Integer newsId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getNewsId() {
		return newsId;
	}

	public void setNewsId(Integer newsId) {
		this.newsId = newsId;
	}
	
	
}
