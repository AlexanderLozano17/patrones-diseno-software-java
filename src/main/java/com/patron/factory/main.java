package com.patron.factory;

public class main {

	public static void main(String[] args) {
	
		EnemyFactory enemyFactory = new EnemyFactory();
		
		Enemy warrior = enemyFactory.createEnemy("warrior");
		warrior.attack();
		
		Enemy mage = enemyFactory.createEnemy("mage");
		mage.attack();
		
	}
}
