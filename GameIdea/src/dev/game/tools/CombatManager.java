package dev.game.tools;

import java.util.ArrayList;

import dev.game.entity.Entity;

public class CombatManager {

	ArrayList<Entity> entities;
	private int expGain;
	private int moneyGain;
	private int itemGain;
	
	public CombatManager() {
		entities = new ArrayList<Entity>();
	}
	
	public void addEntity(Entity e) {
		entities.add(e);
	}
	
	
	public void resolveAction(Entity source, Entity... target) {
		
	}
	
	public void rewardExp() {
		
	}
}
