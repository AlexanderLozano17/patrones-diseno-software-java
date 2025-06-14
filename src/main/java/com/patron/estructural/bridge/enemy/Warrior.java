package com.patron.estructural.bridge.enemy;

import com.patron.estructural.bridge.fighter.Fighter;
import com.patron.estructural.bridge.fighter.WarriorFighertImpl;

public class Warrior extends Enemy {

	public Warrior() {
		setFighter(new WarriorFighertImpl());
	}
	
	@Override
	public int getHealth() {
		return super.getHealth();
	}

	@Override
	public void setHealth(int health) {
		super.setHealth(health);
	}
	
	@Override
	public Fighter getFighter() {
		return super.getFighter();
	}

	@Override
	public void setFighter(Fighter fighter) {
		super.setFighter(fighter);
	}

	public void attack() {
		System.out.println("warrior:");
		getFighter().attack();
	}

	public void protect() {
		System.out.println("warrior:");
		getFighter().protect();
	}
}
