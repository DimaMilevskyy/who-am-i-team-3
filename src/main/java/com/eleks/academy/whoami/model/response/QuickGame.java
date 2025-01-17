package com.eleks.academy.whoami.model.response;

import java.util.List;

import com.eleks.academy.whoami.core.SynchronousGame;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QuickGame {
	
	private String id;
	
	private String status;
	
	private boolean accessibility;
	
	private String playersInGame;
	
	private List<BasePlayerModel> players;
	
	public static QuickGame of(SynchronousGame game) {
		return QuickGame.builder()
				.id(game.getId())
				.status(game.getStatus())
				.accessibility(game.isAvailable())
				.playersInGame(game.getPlayersInGame())
				.players(game.getPlayersList())
				.build();
	}

}
