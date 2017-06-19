package dev.game.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import dev.game.item.Equipment;

// General entity used in combat
public class BattleEntity extends Entity {

	private Character c;
	private Stats stats;
	private ArrayList<Equipment> equipment;
	private List<Effect> activeEffects;

	private HashMap<String, Ability> activeAbilities;
	
	public BattleEntity() {
		stats = new Stats();
		equipment = new ArrayList<Equipment>();
		activeEffects = new ArrayList<Effect>();
		
	}
	
	public BattleEntity(Character c) {
		this.c = c;
		stats = c.getStats();
		equipment = c.getEquipment();
		activeEffects = new ArrayList<Effect>();
		activeAbilities = c.getAbilities();
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

	public List<Effect> getActiveEffects() {
		return activeEffects;
	}

	public void setActiveEffects(List<Effect> activeEffects) {
		this.activeEffects = activeEffects;
	}



	public void addActiveEffect(Effect effect) {
		activeEffects.add(effect);
	}
	
	public HashMap<String, Ability> getActiveAbilities() {
		return activeAbilities;
	}

	public void setActiveAbilities(HashMap<String, Ability> activeAbilities) {
		this.activeAbilities = activeAbilities;
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
