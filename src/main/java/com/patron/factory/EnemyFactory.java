package com.patron.factory;

public class EnemyFactory {

	public Enemy createEnemy(String type) {
		if (type.equalsIgnoreCase("warrior")) {
			return new Warrior();
		}
		if (type.equalsIgnoreCase("mage")) {
			return new Mage();
		}
		return null;
	}
}
