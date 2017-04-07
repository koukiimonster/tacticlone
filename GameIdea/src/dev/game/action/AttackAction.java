package dev.game.action;

import dev.game.entity.Entity;

// An attack action implies that there is an action between at least 2 actors. 
public class AttackAction implements Action {
	
	Entity source;
	Entity[] targets;
	
	public AttackAction(Entity s, Entity... target) {
		this.source = s;
		this.targets = target;
	}
	
	
	// performs the taken action
	@Override
	public void perform() {
		
	}
}
