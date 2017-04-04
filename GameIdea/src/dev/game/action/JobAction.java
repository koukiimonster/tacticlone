package dev.game.action;

import dev.game.entity.Entity;

public class JobAction implements Action {

	Entity s;
	Entity[] targets;
	
	public JobAction(Entity s, Entity... target) {
		this.s = s;
		this.targets = target;
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		
	}
	
}
