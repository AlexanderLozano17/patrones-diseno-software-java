package com.patron.estructural.bridge.enemy;

import com.patron.estructural.bridge.fighter.MageFighertImpl;
import com.patron.estructural.bridge.fighter.WarriorFighertImpl;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("============ WARRIOR ===========");
		Warrior warrior = new Warrior();
		warrior.attack();
		warrior.protect();
		
		warrior.setFighter(new MageFighertImpl());
		warrior.attack();
		warrior.protect();
		
		System.out.println("============ MAGE ===========");
		Mage mage = new Mage();
		mage.attack();
		mage.protect();
		
		mage.setFighter(new WarriorFighertImpl());
		mage.attack();
		mage.protect();
	}

}
