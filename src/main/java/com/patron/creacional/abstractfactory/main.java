package com.patron.creacional.abstractfactory;

import com.patron.creacional.abstractfactory.armor.Armor;
import com.patron.creacional.abstractfactory.weapon.Weapon;
import com.patron.creacional.factory.Enemy;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EnemyAbstractFactory factory = new WarriorFactory();
		
		Enemy warrior = factory.createEnemy();
		Armor heavyArmor = factory.createArmor();
		Weapon axe = factory.createWeapon();
		
		warrior.attack();
		heavyArmor.protect();
		axe.damage();
		
		
		factory = new MageFactory();
		Enemy mage = factory.createEnemy();
		Armor robe = factory.createArmor();
		Weapon wizzardStaff = factory.createWeapon();
		
		mage.attack();
		robe.protect();
		wizzardStaff.damage();
		
	}

}
