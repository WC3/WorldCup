package cn.edu.shu.worldcup.action;

import cn.edu.shu.worldcup.domain.Player;
import cn.edu.shu.worldcup.service.PlayerService;

import com.opensymphony.xwork2.Action;

/**
 * 处理后台添加球员
 * 
 * @author 江辰
 *
 */
public class ManagePlayerProAction implements Action {
	private Player player;
	private PlayerService playerService;

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public void setPlayerService(PlayerService playerService) {
		this.playerService = playerService;
	}

	@Override
	public String execute() throws Exception {
		if (playerService.save(getPlayer())) {
			return SUCCESS;
		} else {
			return ERROR;
		}
	}

}
