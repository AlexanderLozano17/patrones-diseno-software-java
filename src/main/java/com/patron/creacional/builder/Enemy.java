package com.patron.creacional.builder;

public class Enemy {

	private String name;
	private String type;
	private int health;
	private int damage;
	private int endurance;

	private Enemy(Builder builder) {
		this.name = builder.name;
		this.type = builder.type;
		this.health = builder.health;
		this.damage = builder.damage;
		this.endurance = builder.endurance;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public int getHealth() {
		return health;
	}

	public int getDamage() {
		return damage;
	}

	public int getEndurance() {
		return endurance;
	}

	@Override
	public String toString() {
		return "Enemy [name=" + name + ", type=" + type + ", health=" + health + ", damage=" + damage + ", endurance="
				+ endurance + "]";
	}

	public static class Builder {

		private String name;
		private String type;
		private int health;
		private int damage;
		private int endurance;

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder type(String type) {
			this.type = type;
			return this;
		}

		public Builder health(int health) {
			this.health = health;
			return this;
		}

		public Builder damage(int damage) {
			this.damage = damage;
			return this;
		}

		public Builder endurance(int endurance) {
			this.endurance = endurance;
			return this;
		}

		public Enemy build() {
			return new Enemy(this);
		}
	}

}
