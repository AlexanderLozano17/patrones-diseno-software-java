package com.patron.estructural.decorate.race;

import com.patron.estructural.decorate.Enemy;

public class Human implements Enemy {

	@Override
	public void attack() {
		System.out.println("Human attack!!");
		
	}

}
