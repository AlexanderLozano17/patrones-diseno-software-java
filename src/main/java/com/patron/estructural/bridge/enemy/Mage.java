package com.patron.estructural.bridge.enemy;

import com.patron.estructural.bridge.fighter.Fighter;
import com.patron.estructural.bridge.fighter.MageFighertImpl;

public class Mage extends Enemy {
	
	public Mage() {
		setFighter(new MageFighertImpl());
	}

	@Override
	public int getHealth() {
		return super.getHealth();
	}

	@Override
	public void setHealth(int health) {
		super.setHealth(health);
	}

	public void attack() {
		System.out.println("mage:!!");
		getFighter().attack();
		
	}

	public void protect() {
		System.out.println("mage:!!");
		getFighter().protect();
	}

	@Override
	public Fighter getFighter() {
		return super.getFighter();
	}

	@Override
	public void setFighter(Fighter fighter) {
		super.setFighter(fighter);
	}
	
}
