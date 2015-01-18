package cn.edu.shu.worldcup.domain;

/**
 * 球员的持久化类，包含球员的姓名、球队、出场、时间、进球等信息
 * 
 * @author 江辰
 *
 */
public class Player {
	// 标识
	private Integer id;
	// 姓名
	private String name;
	// 球队
	private String team;
	// 出场
	private Integer appearance;
	// 时间
	private Integer time;
	// 进球
	private Integer goals;
	// 点球
	private Integer penalties;
	// 助攻
	private Integer assists;
	// 射正
	private Integer shots;
	// 射门
	private Integer shooting;
	// 传球
	private Integer passing;
	// 传中
	private Integer biography;
	// 角球
	private Integer corner;
	// 越位
	private Integer offside;
	// 触球
	private Integer ball;
	// 犯规
	private Integer foul;
	// 封堵
	private Integer closure;
	// 黄牌
	private Integer yellow;
	// 红牌
	private Integer red;

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

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public Integer getAppearance() {
		return appearance;
	}

	public void setAppearance(Integer appearance) {
		this.appearance = appearance;
	}

	public Integer getTime() {
		return time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

	public Integer getGoals() {
		return goals;
	}

	public void setGoals(Integer goals) {
		this.goals = goals;
	}

	public Integer getPenalties() {
		return penalties;
	}

	public void setPenalties(Integer penalties) {
		this.penalties = penalties;
	}

	public Integer getAssists() {
		return assists;
	}

	public void setAssists(Integer assists) {
		this.assists = assists;
	}

	public Integer getShots() {
		return shots;
	}

	public void setShots(Integer shots) {
		this.shots = shots;
	}

	public Integer getShooting() {
		return shooting;
	}

	public void setShooting(Integer shooting) {
		this.shooting = shooting;
	}

	public Integer getPassing() {
		return passing;
	}

	public void setPassing(Integer passing) {
		this.passing = passing;
	}

	public Integer getBiography() {
		return biography;
	}

	public void setBiography(Integer biography) {
		this.biography = biography;
	}

	public Integer getCorner() {
		return corner;
	}

	public void setCorner(Integer corner) {
		this.corner = corner;
	}

	public Integer getOffside() {
		return offside;
	}

	public void setOffside(Integer offside) {
		this.offside = offside;
	}

	public Integer getBall() {
		return ball;
	}

	public void setBall(Integer ball) {
		this.ball = ball;
	}

	public Integer getFoul() {
		return foul;
	}

	public void setFoul(Integer foul) {
		this.foul = foul;
	}

	public Integer getClosure() {
		return closure;
	}

	public void setClosure(Integer closure) {
		this.closure = closure;
	}

	public Integer getYellow() {
		return yellow;
	}

	public void setYellow(Integer yellow) {
		this.yellow = yellow;
	}

	public Integer getRed() {
		return red;
	}

	public void setRed(Integer red) {
		this.red = red;
	}

}
