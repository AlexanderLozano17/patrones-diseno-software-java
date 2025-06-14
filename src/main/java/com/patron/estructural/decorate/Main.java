package com.patron.estructural.decorate;

import com.patron.estructural.decorate.race.Elf;
import com.patron.estructural.decorate.race.Human;

public class Main {

	public static void main(String[] args) {
	
        System.out.println("======== Human Warrior ========");
        Enemy humanWarrior = new WarriorEnemyDecorator(new Human());
        humanWarrior.attack();
        System.out.println("======== Human Warrior Mage ========");
        Enemy humanWarriorMage = new WarriorEnemyDecorator(new MageEnemyDecorator(new Human()));
        humanWarriorMage.attack();
        System.out.println("======== Elf Warrior Mage Assassin========");
        Enemy elfWarriorMageAssassin = new AssassinEnemyDecorator(
                new MageEnemyDecorator(
                        new WarriorEnemyDecorator(
                                new Elf()
                        )
                )
        );
        elfWarriorMageAssassin.attack();

	}

}
