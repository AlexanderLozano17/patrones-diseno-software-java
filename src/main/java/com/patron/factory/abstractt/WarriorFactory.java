package com.patron.factory.abstractt;

import com.patron.factory.Enemy;
import com.patron.factory.Warrior;
import com.patron.factory.abstractt.armor.Armor;
import com.patron.factory.abstractt.armor.HeavyArmor;
import com.patron.factory.abstractt.weapon.Axe;
import com.patron.factory.abstractt.weapon.Weapon;

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
