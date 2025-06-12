package com.patron.creacional.abstractfactory;

import com.patron.creacional.abstractfactory.armor.Armor;
import com.patron.creacional.abstractfactory.weapon.Weapon;
import com.patron.creacional.factory.Enemy;

public abstract class EnemyAbstractFactory {

	public abstract Enemy createEnemy();
	
	public abstract Armor createArmor();
	
	public abstract Weapon createWeapon();
}
