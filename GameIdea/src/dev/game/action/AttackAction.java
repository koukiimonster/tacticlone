package dev.game.action;

import dev.game.entity.BattleEntity;

// An attack action implies that there is an action between at least 2 actors. 
public class AttackAction implements Action {
	
	BattleEntity source;
	BattleEntity[] targets;
	
	public AttackAction(BattleEntity s, BattleEntity... target) {
		this.source = s;
		this.targets = target;
	}
	
	
	// performs the taken action
	@Override
	public void perform() {
		int damage = source.getStats().getStrength();
		
		for (BattleEntity target: targets) {
			int targetHp = target.getCurrentHp();
			int def = target.getStats().getArmorRating();
			int dodgeRate = target.getStats().getAgility();
			int armorRating = target.getStats().getArmorRating();
			
			// set dodge rate here? or check dodge rate first?
			// formula for damage is base defense + armor rating as a percentage of the base defense?
			targetHp -= targetHp - (damage - (def + (def * (armorRating/100))));
			
			if(targetHp < 1) {
				targetHp = 0;
			}
			target.getStats().setCurrentHp(targetHp);
		}
	}
}
