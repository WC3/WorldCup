package cn.edu.shu.worldcup.action;

import java.util.Iterator;

import cn.edu.shu.worldcup.domain.Player;
import cn.edu.shu.worldcup.service.PlayerService;

import com.opensymphony.xwork2.Action;

/**
 * 处理查看全部球员
 * 
 * @author 江辰
 *
 */
public class PlayerAllAction implements Action {
	private long playerNumber;
	private Iterator<Player> it;
	private PlayerService playerService;

	public long getPlayerNumber() {
		return playerNumber;
	}

	public void setPlayerNumber(long playerNumber) {
		this.playerNumber = playerNumber;
	}

	public Iterator<Player> getIt() {
		return it;
	}

	public void setIt(Iterator<Player> it) {
		this.it = it;
	}

	public void setPlayerService(PlayerService playerService) {
		this.playerService = playerService;
	}

	@Override
	public String execute() throws Exception {
		setPlayerNumber(playerService.getPlayerNumber());
		setIt(playerService.searchAllPlayer());
		return SUCCESS;
	}

}
