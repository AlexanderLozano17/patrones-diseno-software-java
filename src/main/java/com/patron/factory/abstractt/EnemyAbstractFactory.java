package com.patron.factory.abstractt;

import com.patron.factory.Enemy;
import com.patron.factory.abstractt.armor.Armor;
import com.patron.factory.abstractt.weapon.Weapon;

public abstract class EnemyAbstractFactory {

	public abstract Enemy createEnemy();
	
	public abstract Armor createArmor();
	
	public abstract Weapon createWeapon();
}
