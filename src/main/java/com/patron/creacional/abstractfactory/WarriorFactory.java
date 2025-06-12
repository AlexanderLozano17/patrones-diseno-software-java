package com.patron.creacional.abstractfactory;

import com.patron.creacional.abstractfactory.armor.Armor;
import com.patron.creacional.abstractfactory.armor.HeavyArmor;
import com.patron.creacional.abstractfactory.weapon.Axe;
import com.patron.creacional.abstractfactory.weapon.Weapon;
import com.patron.creacional.factory.Enemy;
import com.patron.creacional.factory.Warrior;

public class WarriorFactory extends EnemyAbstractFactory {

	@Override
	public Enemy createEnemy() {
		// TODO Auto-generated method stub
		return new Warrior();
	}

	@Override
	public Armor createArmor() {
		// TODO Auto-generated method stub
		return new HeavyArmor();
	}

	@Override
	public Weapon createWeapon() {
		// TODO Auto-generated method stub
		return new Axe();
	}

}
