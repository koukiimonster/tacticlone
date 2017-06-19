package dev.game.jobclass;

import java.util.ArrayList;

import dev.game.entity.*;
/** Job classes contain the stat bonuses and other information that are unique to each class.
 * 
 * @author Sok
 *
 */
public abstract class JobClass {

	int rank;
	boolean isSpecialized;
	ArrayList<Ability> abilities;
	
	
	double strengthMod;
	double hpMod;
	double vigorMod;
	double defenseMod;
	double intelligenceMod;
	double speedMod;
	double agilityMod;
	double mpMod;
	
	boolean canEquipSmallShield = false;
	boolean canEquipMediumShield = false;
	boolean canEquipGreatShield = false;
	boolean canEquip = false;
	boolean canEquipOneHandSword = false;
	boolean canEquipTwoHandSword = false;
	boolean canEquipSpear = false;
	boolean canEquipLance = false;
	boolean canEquipOneHandAxe = false;
	boolean canEquipTwoHandAxe = false;
	boolean canEquipBow = false;
	boolean canEquipCrossbow = false;
	boolean canEquipStaff = false;
	boolean canEquipGreatstaff = false;
	boolean canEquipTalisman = false;
	boolean canEquipClothArmor = false;
	boolean canEquipLightArmor = false;
	boolean canEquipMediumArmor = false;
	boolean canEquipHeavyArmor = false;
	boolean canEquipHelmet = true;
	boolean canEquipChest = true;
    boolean canEquipArms = true;
	boolean canEquipLegs = true;
	
	
	
	public JobClass() {
		
	}

	// Initializes the job class information by id
	public JobClass(int id) {
		
	}
	
	public double getStrengthMod() {
		return strengthMod;
	}

	public void setStrengthMod(int strengthMod) {
		this.strengthMod = strengthMod;
	}

	public double getHpMod() {
		return hpMod;
	}

	public void setHpMod(int hpMod) {
		this.hpMod = hpMod;
	}

	public double getVigorMod() {
		return vigorMod;
	}

	public void setVigorMod(int vigorMod) {
		this.vigorMod = vigorMod;
	}

	public double getDefenseMod() {
		return defenseMod;
	}

	public void setDefenseMod(int defenseMod) {
		this.defenseMod = defenseMod;
	}

	public double getIntelligenceMod() {
		return intelligenceMod;
	}

	public void setIntelligenceMod(int intelligenceMod) {
		this.intelligenceMod = intelligenceMod;
	}

	public double getSpeedMod() {
		return speedMod;
	}

	public void setSpeedMod(int speedMod) {
		this.speedMod = speedMod;
	}

	public double getAgilityMod() {
		return agilityMod;
	}

	public void setAgilityMod(int agilityMod) {
		this.agilityMod = agilityMod;
	}

	public double getMpMod() {
		return mpMod;
	}

	public void setMpMod(int mpMod) {
		this.mpMod = mpMod;
	}
	
	public void rankUp() {
		// handle normal rank up
		if(rank < 8) {
			rank++;
		}
		
		// handle specialize rank up
		if(rank > 8 && rank < 11 && isSpecialized) {
			rank++;
		}
	}
	
	public void specialize() {
		if (rank == 8) {
			rank++;
			isSpecialized = true;
		}
	}
	
}
