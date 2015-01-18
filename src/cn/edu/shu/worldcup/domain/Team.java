package cn.edu.shu.worldcup.domain;

/**
 * 球队的持久化类，对应球队的队名、分组、场次、进球、失球等信息
 * 
 * @author 江辰
 *
 */
public class Team {
	// 标识
	private Integer id;
	// 队名
	private String name;
	// 分组
	private String group;
	// 场次
	private Integer event;
	// 进球
	private Integer goals;
	// 失球
	private Integer conceded;
	// 助攻
	private Integer assists;
	// 射正
	private Integer shots;
	// 射门
	private Integer shooting;
	// 扑救
	private Integer fighting;
	// 抢断
	private Integer steals;
	// 拦截
	private Integer intercept;
	// 犯规
	private Integer foul;
	// 封堵
	private Integer closure;
	// 越位
	private Integer offside;
	// 传球
	private Integer passing;
	// 控球率
	private String possession;
	// 黄牌
	private Integer yellow;
	// 红牌
	private Integer red;
	// 角球
	private Integer corner;

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

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public Integer getEvent() {
		return event;
	}

	public void setEvent(Integer event) {
		this.event = event;
	}

	public Integer getGoals() {
		return goals;
	}

	public void setGoals(Integer goals) {
		this.goals = goals;
	}

	public Integer getConceded() {
		return conceded;
	}

	public void setConceded(Integer conceded) {
		this.conceded = conceded;
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

	public Integer getFighting() {
		return fighting;
	}

	public void setFighting(Integer fighting) {
		this.fighting = fighting;
	}

	public Integer getSteals() {
		return steals;
	}

	public void setSteals(Integer steals) {
		this.steals = steals;
	}

	public Integer getIntercept() {
		return intercept;
	}

	public void setIntercept(Integer intercept) {
		this.intercept = intercept;
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

	public Integer getOffside() {
		return offside;
	}

	public void setOffside(Integer offside) {
		this.offside = offside;
	}

	public Integer getPassing() {
		return passing;
	}

	public void setPassing(Integer passing) {
		this.passing = passing;
	}

	public String getPossession() {
		return possession;
	}

	public void setPossession(String possession) {
		this.possession = possession;
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

	public Integer getCorner() {
		return corner;
	}

	public void setCorner(Integer corner) {
		this.corner = corner;
	}

}
