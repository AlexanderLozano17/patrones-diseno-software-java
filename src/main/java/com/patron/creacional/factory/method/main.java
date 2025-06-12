package com.patron.creacional.factory.method;

public class main {

	public static void main(String[] args) {
		
		Enemy warrio = new WarriorFactory().createEnemy();
		warrio.attack();
		
		Enemy Mage = new MageFactory().createEnemy();
		Mage.attack();
	}

}
