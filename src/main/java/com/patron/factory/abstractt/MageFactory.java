package com.patron.factory.abstractt;

import com.patron.factory.Enemy;
import com.patron.factory.Mage;
import com.patron.factory.abstractt.armor.Armor;
import com.patron.factory.abstractt.armor.Robe;
import com.patron.factory.abstractt.weapon.Weapon;
import com.patron.factory.abstractt.weapon.WizardStaff;

public class MageFactory extends EnemyAbstractFactory {

	@Override
	public Enemy createEnemy() {
		// TODO Auto-generated method stub
		return new  Mage();
	}

	@Override
	public Armor createArmor() {
		// TODO Auto-generated method stub
		return new Robe();
	}

	@Override
	public Weapon createWeapon() {
		// TODO Auto-generated method stub
		return new WizardStaff();
	}

}
