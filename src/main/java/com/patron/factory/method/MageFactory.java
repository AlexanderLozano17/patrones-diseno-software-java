package com.patron.factory.method;

public class MageFactory extends EnemyFactory {

	@Override
	public Enemy createEnemy() {
		return new Mage();
	}

}
