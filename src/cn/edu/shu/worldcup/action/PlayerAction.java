package cn.edu.shu.worldcup.action;

import cn.edu.shu.worldcup.domain.Player;
import cn.edu.shu.worldcup.service.PlayerService;

import com.opensymphony.xwork2.Action;

/**
 * 处理球员搜索
 * 
 * @author 江辰
 *
 */
public class PlayerAction implements Action {
	private Player player;
	private PlayerService playerService;
	private boolean flag;

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public void setPlayerService(PlayerService playerService) {
		this.playerService = playerService;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	@Override
	public String execute() throws Exception {
		player = playerService.searchByName(player.getName());
		if (player == null) {
			setFlag(false);
			return ERROR;
		} else {
			setFlag(true);
			return SUCCESS;
		}
	}

}
