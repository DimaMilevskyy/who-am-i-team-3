package com.eleks.academy.whoami.model.response;

import com.eleks.academy.whoami.core.SynchronousPlayer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlayerSuggestion {
	
	private String username;
	
	private String nickname;
	
	private String suggestion;
	
	public static PlayerSuggestion of(SynchronousPlayer player) {
		return PlayerSuggestion.builder()
				.username(player.getUserName())
				.nickname(player.getNickName())
				.suggestion(player.getCharacter())
				.build();
	}
}
