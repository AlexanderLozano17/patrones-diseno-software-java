package com.patron.estructural.decorate;

public class MageEnemyDecorator extends EnemyDecorator {

	public MageEnemyDecorator(Enemy enemy) {
		super(enemy);
	}

	@Override
	public void attack() {
		super.attack();
		 System.out.println("Mage attack!!");
	}
	
	

}
