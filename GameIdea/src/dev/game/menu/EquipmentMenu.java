package dev.game.menu;

import dev.game.entity.Character;
import dev.game.item.Equipment;
import dev.game.item.Inventory;
import dev.game.item.Item;

/** Menu for handling equipping items to a selected character. This class needs to be able to see the player's current inventory and the character's equipped item
 * 
 * @author TSok
 *
 */
public class EquipmentMenu {

	private Inventory playerInventory;
	
	
	
	public EquipmentMenu() {
		
	}
	
	public EquipmentMenu(Inventory inventory) {
		this.playerInventory = inventory;
	}

	public void populate(Character c, Inventory i) {
		c.getEquipment();
	}
	
	public void equipItem(Character c, Equipment e) {
		int equipSlotType = e.getType();
		
		// Check to see if there is already an item equipped in the slot, if so, update the player's inventory properly
		if (c.getEquipment().get(equipSlotType) == null) {
			c.getEquipment().add(e.getType(), e);
			
			
		}
	}
	
	
}
