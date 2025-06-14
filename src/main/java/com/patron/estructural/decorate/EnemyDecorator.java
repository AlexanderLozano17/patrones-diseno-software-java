package com.patron.estructural.decorate;

public abstract class EnemyDecorator implements Enemy {

	protected Enemy enemy;
	
	public EnemyDecorator(Enemy enemy) {
		this.enemy = enemy;
	}

	@Override
	public void attack() {
		this.enemy.attack();
		
	}
}
