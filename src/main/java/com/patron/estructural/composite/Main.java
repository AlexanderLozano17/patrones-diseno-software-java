package com.patron.estructural.composite;

public class Main {

	public static void main(String[] args) {
		
		BaseItem inventory = new Bag("inventory");
		BaseItem bagCoins = new Bag("bag coins");
		BaseItem bagPotions = new Bag("bag potions");
		
		BaseItem coins = new Item("coins", 3);
		bagCoins.add(coins);
		
		BaseItem magicPotion = new Item("Magic Potion", 3);
		BaseItem healthPotion = new Item("Health Potion", 3);
		bagPotions.add(magicPotion);
		bagPotions.add(healthPotion);
		
		BaseItem blade = new Item("blade", 3);
		BaseItem shield = new Item("shield", 3);
		
		inventory.add(bagCoins);
		inventory.add(bagPotions);
		inventory.add(blade);
		inventory.add(shield);
		
		System.out.println("inventory total value " + inventory.getValue());
	}

}
