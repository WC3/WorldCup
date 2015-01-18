package cn.edu.shu.worldcup.domain;

/**
 * 赛程的持久化类，包含比赛的场次，时间，地点，直播频道，以及比赛的对阵结果及比赛小组
 * @author 陈超
 *
 */
public class Schedule {

	// 标识
	private Integer id;
	//比赛场次
	private String sessions;
	//比赛时间
	private String time;
	//比赛地点
	private String venue;
	//比赛结果
	private String result;
	//赛事直播
	private String live;
	//比赛组别
	private String group;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSessions() {
		return sessions;
	}
	public void setSessions(String sessions) {
		this.sessions = sessions;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getLive() {
		return live;
	}
	public void setLive(String live) {
		this.live = live;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	
}
