package com.patron.creacional.builder;

public class Main {

	public static void main(String[] args) {
		
		Enemy enemy = new Enemy.Builder()
				.name("Pepe")
				.type("Mage")
				.health(100)
				.damage(100)
				.endurance(100)
				.build();
		
		System.out.println(enemy.toString());

	}

}
