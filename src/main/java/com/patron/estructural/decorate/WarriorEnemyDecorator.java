package com.patron.estructural.decorate;

public class WarriorEnemyDecorator extends EnemyDecorator {

	public WarriorEnemyDecorator(Enemy enemy) {
		super(enemy);
	}

	@Override
	public void attack() {
		super.attack();
		 System.out.println("Warrior attack!!");
	}
	
}
