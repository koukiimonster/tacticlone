package dev.game.action;

import java.util.ArrayList;

import dev.game.entity.Entity;

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
