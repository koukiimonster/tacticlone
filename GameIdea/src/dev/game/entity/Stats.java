package dev.game.entity;

public class Stats {

	int hp; 				// max hp
	int currentHp;			// current hp
	int strength;			// determines physical strength. Influences physical damage
	int vigor;				// determines hp. Influences hp gain per level up
	int speed;				// Determines how fast a character's turn will come up
	int agility;			// determines evasion. Influences dodge rate.
	int defense;			// determines base physical defense. Raw defense with no armor on.
	int armorRating;		// determines physical defense. Influenced by armor worn.
	int intelligence;		// determines magic attack and defense. Influences how many spells you can learn and level of spells. Higher int = higher attack and def
	int mp;					// max mp
	int currentMp;			// current mp
	int movement;			// determines range of movement
	int height;				// determines jump height
	
	
	public Stats() {
		
	}
	
	// The idea is that a name or ID is passed and this would go out to a file and retrieve the data by that name or ID, such as a xml file or something
	public Stats(String name) {
		
	}
	
	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getCurrentHp() {
		return currentHp;
	}

	public void setCurrentHp(int currentHp) {
		this.currentHp = currentHp;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getArmorRating() {
		return armorRating;
	}

	public void setArmorRating(int armorRating) {
		this.armorRating = armorRating;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getCurrentMp() {
		return currentMp;
	}

	public void setCurrentMp(int currentMp) {
		this.currentMp = currentMp;
	}

	public int getVigor() {
		return vigor;
	}

	public void setVigor(int vigor) {
		this.vigor = vigor;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	public int getMovement() {
		return movement;
	}

	public void setMovement(int movement) {
		this.movement = movement;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
}
