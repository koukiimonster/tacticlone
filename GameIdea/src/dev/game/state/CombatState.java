package dev.game.state;

import java.util.HashMap;

import dev.game.combat.BattleEntityFactory;
import dev.game.entity.BattleEntity;
import dev.game.tools.CombatManager;

public class CombatState extends State {

	CombatManager manager;
	HashMap<String, BattleEntity> entityList;
	// Something for turn order
	
	public CombatState() {
		manager = new CombatManager();
		this.init();
	}
	
	// Initializes the Combat state
	private void init() {
		BattleEntityFactory enemyFactory = new BattleEntityFactory();
		String enemyName = "";
		entityList.put(enemyName, enemyFactory.getBattleEntity(enemyName));
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processInput() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
