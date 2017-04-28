package dev.game.entity;

import dev.game.item.Equipment;

public class BattleEntity extends Entity {

	//Character c;
	private Stats stats;
	private Equipment equipment;
	
	public BattleEntity() {
		stats = new Stats();
		equipment = new Equipment();
	}
	
	public BattleEntity(String name) {
		super(name);
		stats = new Stats();
		equipment = new Equipment();
	}
	
	public Stats getStats() {
		return stats;
	}

	public void setStats(Stats stats) {
		this.stats = stats;
	}
	
	// How do we simplify this...
	public int getStrength() {
		return this.stats.strength;
	}
	
	public int getCurrentHp() {
		return this.stats.currentHp;
	}
	
	public int getCurrentMp() {
		return this.stats.currentMp;
	}
	
	public int getDefense() {
		return this.stats.defense;
	}
	
	public int getIntelligence() {
		return this.stats.intelligence;
	}
	
	public int getSpeed() {
		return this.stats.speed;
	}
	
	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

	public String toString() {
		String info = name
				+ "\nMax HP: " + stats.hp
				+ "\nHP: " + stats.currentHp
				+ "\nMax MP: " + stats.mp
				+ "\nMP: " + stats.currentMp
				+ "\nStrength: " + stats.strength
				+ "\nDefense: " + stats.defense
				+ "\nArmor Rating: " + stats.armorRating
				+ "\nVigor: " + stats.vigor
				+ "\nSpeed: " + stats.speed
				+ "\nAgility: " + stats.agility
				+ "\nIntelligence: " + stats.intelligence
				+ "\nMovement: " + stats.movement
				+ "\nHeight: " + stats.height; 
		
		return info;
	}
}
