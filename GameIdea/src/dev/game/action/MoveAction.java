package dev.game.action;

import dev.game.entity.BattleEntity;

public class MoveAction implements Action {

	BattleEntity entity;
	int x, y;
	
	public MoveAction(BattleEntity entity, int x, int y) {
		this.entity = entity;
		this.x = x;
		this.y = y;
	}


	// Performs the move action
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		
	}

}
