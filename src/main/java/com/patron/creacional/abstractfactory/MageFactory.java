package com.patron.creacional.abstractfactory;

import com.patron.creacional.abstractfactory.armor.Armor;
import com.patron.creacional.abstractfactory.armor.Robe;
import com.patron.creacional.abstractfactory.weapon.Weapon;
import com.patron.creacional.abstractfactory.weapon.WizardStaff;
import com.patron.creacional.factory.Enemy;
import com.patron.creacional.factory.Mage;

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
