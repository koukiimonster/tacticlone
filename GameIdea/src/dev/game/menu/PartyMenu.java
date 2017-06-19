package dev.game.menu;

import java.util.HashMap;

import dev.game.state.State;

/** Menu that allows the player to manage their party. This menu leads to the StatusMenu, EquipmentMenu
 * 
 * @author TSok
 *
 */
public class PartyMenu implements Menu {

	public enum OPTIONS {
		STATUS, EQUIPMENT, JOB, ABILITIES;
	}
	
	HashMap<String, Character> partyList;
	
	public PartyMenu(HashMap<String, Character> partyList) {
		this.partyList = partyList;
	}
	
	public Menu select(OPTIONS option) {
		switch(option) {
		
		case STATUS: return new StatusMenu();
		case ABILITIES: return new AbilityMenu();
		case EQUIPMENT: return new EquipmentMenu();
		case JOB: return new JobMenu();
		default: return null;
		}
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		
	}
	
	
}
