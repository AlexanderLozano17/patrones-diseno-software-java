package com.patron.creacional.singlenton;

public class Main {

	public static void main(String[] str) {
		
		Thread threadPepe = new Thread(new RunPepe());
		threadPepe.start();
		
		Thread threadManolo = new Thread(new RunManolo());
		threadManolo.start();
		
	}
	
	static class RunPepe implements Runnable {

		@Override
		public void run() {
			Player player = Player.getPlayer("pepe");
			System.err.println(player);			
		}
		
	}
	
	static class RunManolo implements Runnable {

		@Override
		public void run() {
			Player player = Player.getPlayer("Manolo");
			System.err.println(player);	
			
		}
		
	}
	
} 
