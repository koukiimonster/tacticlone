package dev.game.jobclass;

import dev.game.entity.Stats;

public class Warrior extends JobClass {

	final int id = 1;
	
	public Warrior() {
		canEquipOneHandSword = true;
		canEquipTwoHandSword = true;
		canEquipSmallShield = true;
		canEquipMediumShield = true;
		canEquipMediumArmor = true;
		canEquipHeavyArmor = true;
	}
	
	
	
}
