package com.patron.creacional.singlenton;

public class Player {

	private String name;
	private static volatile Player player;
	
	private Player(String name) {
		this.name = name;
	}
	
	public static Player getPlayer(String name) {
		if (player == null) {
			player = new Player(name);
		}
		return player;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + "]";
	}
}
