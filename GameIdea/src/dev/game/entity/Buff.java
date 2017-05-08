package dev.game.entity;

import java.util.List;

public class Buff implements Effect {

	public enum Buffs {
		STRONG, HASTE, BERSERK, MAGIC_UP, DEFENSE_UP, ATTACK_UP, MAG_DEF_UP;
	}
	
	
	public void apply(BattleEntity e) {
		List<Buff> buffs = e.getActiveBuffs();
		
	}
}
