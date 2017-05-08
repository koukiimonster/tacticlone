package dev.game.tools;

import java.util.ArrayList;
import java.util.HashMap;

import dev.game.entity.BattleEntity;
import dev.game.entity.Entity;

public class CombatManager {

	ArrayList<BattleEntity> entities;
	HashMap<BattleEntity, Coordinate> locationList;
	private int expGain;
	private int moneyGain;
	private int itemGain;
	
	public CombatManager() {
		entities = new ArrayList<BattleEntity>();
		locationList = new HashMap<BattleEntity, Coordinate>();
	}
	
	public void addEntity(BattleEntity e) {
		entities.add(e);
	}
	
	
	public void resolveAction(BattleEntity source, BattleEntity... target) {
		
	}
	
	public void rewardExp() {
		
	}
	
	public Coordinate getLocation(BattleEntity b) {
		return locationList.get(b);
	}
	
	public void setLocation(BattleEntity b, Coordinate c) {
		locationList.put(b, c);
	}
}
