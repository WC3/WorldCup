package cn.edu.shu.worldcup.domain;

/**
 * 用户的持久化类，对应用户的用户名、密码、Email等信息
 * 
 * @author 江辰
 *
 */
public class User {
	private Integer id;
	private String name;
	private String pass;
	private String email;

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

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
