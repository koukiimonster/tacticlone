package dev.game.entity;

public class Ability {

	// identifier for the ability
	private int id;
	private String name;
	private int type;
	private int cost;
	
	private Effect effect;		// not all abilities will have an effect
	
	public Ability() {
		
	}

	public Ability(int id) {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public Effect getEffect() {
		return effect;
	}

	public void setEffect(Effect effect) {
		this.effect = effect;
	}
	
	
}
