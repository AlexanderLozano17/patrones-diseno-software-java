package com.patron.creacional.factory.method;

public class WarriorFactory extends EnemyFactory {

	@Override
	public Enemy createEnemy() {
		return new Warrior();
	}

}
