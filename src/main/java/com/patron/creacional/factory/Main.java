package com.patron.creacional.factory;

public class Main {

	public static void main(String[] args) {
	
		EnemyFactory enemyFactory = new EnemyFactory();
		
		Enemy warrior = enemyFactory.createEnemy("warrior");
		warrior.attack();
		
		Enemy mage = enemyFactory.createEnemy("mage");
		mage.attack();
		
	}
}
