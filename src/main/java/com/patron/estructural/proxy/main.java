package com.patron.estructural.proxy;

import java.io.IOException;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameImpl gameImpl = new GameImpl();
		try {
			gameImpl.newGame("player1");
			ProxyGameImpl proxyGame = new ProxyGameImpl(gameImpl);
			proxyGame.load("player1");
			System.out.println(proxyGame.getStats());
			
			proxyGame.getStats().setKills(10);
			proxyGame.getStats().setDeaths(2);
			proxyGame.getStats().setLevel(10);
			proxyGame.save("player1");
			
			proxyGame.load("player1");
			System.out.println(proxyGame.getStats());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
