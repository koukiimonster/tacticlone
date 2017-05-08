package dev.game.action;

import dev.game.entity.BattleEntity;

public class JobAction implements Action {

	BattleEntity s;
	BattleEntity[] targets;
	
	public JobAction(BattleEntity s, BattleEntity... target) {
		this.s = s;
		this.targets = target;
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		
	}
	
}
