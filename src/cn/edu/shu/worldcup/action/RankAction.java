package cn.edu.shu.worldcup.action;

import java.util.Iterator;

import cn.edu.shu.worldcup.domain.Player;
import cn.edu.shu.worldcup.service.PlayerService;

import com.opensymphony.xwork2.Action;

/**
 * 处理数据飙榜
 * 
 * @author 江辰
 *
 */
public class RankAction implements Action {
	// 射手榜
	private Iterator<Player> it1;
	// 助攻榜
	private Iterator<Player> it2;
	// 射门榜
	private Iterator<Player> it3;
	// 传球榜
	private Iterator<Player> it4;
	// 触球榜
	private Iterator<Player> it5;
	// 犯规榜
	private Iterator<Player> it6;
	// 封堵榜
	private Iterator<Player> it7;
	// 黄牌榜
	private Iterator<Player> it8;
	// 红牌榜
	private Iterator<Player> it9;
	private PlayerService playerService;

	public Iterator<Player> getIt1() {
		return it1;
	}

	public void setIt1(Iterator<Player> it1) {
		this.it1 = it1;
	}

	public Iterator<Player> getIt2() {
		return it2;
	}

	public void setIt2(Iterator<Player> it2) {
		this.it2 = it2;
	}

	public Iterator<Player> getIt3() {
		return it3;
	}

	public void setIt3(Iterator<Player> it3) {
		this.it3 = it3;
	}

	public Iterator<Player> getIt4() {
		return it4;
	}

	public void setIt4(Iterator<Player> it4) {
		this.it4 = it4;
	}

	public Iterator<Player> getIt5() {
		return it5;
	}

	public void setIt5(Iterator<Player> it5) {
		this.it5 = it5;
	}

	public Iterator<Player> getIt6() {
		return it6;
	}

	public void setIt6(Iterator<Player> it6) {
		this.it6 = it6;
	}

	public Iterator<Player> getIt7() {
		return it7;
	}

	public void setIt7(Iterator<Player> it7) {
		this.it7 = it7;
	}

	public Iterator<Player> getIt8() {
		return it8;
	}

	public void setIt8(Iterator<Player> it8) {
		this.it8 = it8;
	}

	public Iterator<Player> getIt9() {
		return it9;
	}

	public void setIt9(Iterator<Player> it9) {
		this.it9 = it9;
	}

	public void setPlayerService(PlayerService playerService) {
		this.playerService = playerService;
	}

	@Override
	public String execute() throws Exception {
		setIt1(playerService.searchOrderByGoals());
		setIt2(playerService.searchOrderByAssists());
		setIt3(playerService.searchOrderByShooting());
		setIt4(playerService.searchOrderByPassing());
		setIt5(playerService.searchOrderByBall());
		setIt6(playerService.searchOrderByFoul());
		setIt7(playerService.searchOrderByClosure());
		setIt8(playerService.searchOrderByYellow());
		setIt9(playerService.searchOrderByRed());
		return SUCCESS;
	}

}
