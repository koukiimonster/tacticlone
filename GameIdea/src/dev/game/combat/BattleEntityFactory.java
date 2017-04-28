package dev.game.combat;

import dev.game.entity.BattleEntity;

// Called when combat is encountered. Called at the beginning to load in the battle entities for the battle
// Goes out to a file that has all the enemy data and loads the data in from there to create a battle entity and returns it back to the combat manager
public class BattleEntityFactory {

	public BattleEntity getBattleEntity(String entityName) {
		
		BattleEntity entity = new BattleEntity();
		
		return entity;
		
		
	}
}
