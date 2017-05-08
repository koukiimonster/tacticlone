package dev.game.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import dev.game.item.Equipment;

public class Character extends Entity {

	private Stats stats;
	private ArrayList<Equipment> equipment;
	private HashMap<String, Ability> abilities;
	
	public Character() {
		stats = new Stats();
		equipment = new ArrayList<Equipment>();
		abilities = new HashMap<String, Ability>();
	}
	
	public Character(String name) {
		super(name);
		stats = new Stats();
		equipment = new ArrayList<Equipment>();
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
	
	public ArrayList<Equipment> getEquipment() {
		return equipment;
	}

	public void setEquipment(ArrayList<Equipment> equipment) {
		this.equipment = equipment;
	}

	public void setAbilities(HashMap<String, Ability> abilities) {
		this.abilities = abilities;
	}
	
	public HashMap<String, Ability> getAbilities() {
		return this.abilities;
	}
	
	public Ability getAbility(String name) {
		Ability a = abilities.get(name);
		return a;
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
