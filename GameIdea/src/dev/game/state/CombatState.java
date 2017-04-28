package dev.game.state;

import dev.game.tools.CombatManager;

public class CombatState implements State {

	CombatManager manager;

	public CombatState() {
		manager = new CombatManager();
		this.init();
	}
	
	// Initializes the Combat state
	private void init() {
		
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
