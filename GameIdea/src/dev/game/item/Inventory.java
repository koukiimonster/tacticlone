package dev.game.item;

import java.io.File;
import java.util.HashMap;

public class Inventory {

	HashMap<Integer, Item> inventory;
	
	public Inventory() {
		inventory = new HashMap<Integer, Item>();
	}
	
	// Reads the inventory data from the save file
	public Inventory(File file) {
		
	}
	
	
	public Item getItem(int id) {
		// If the item exists in the player's inventory then return the item, otherwise we return nothing.
		if(inventory.containsKey(id)) {
			return inventory.get(id);
		}
		
		return null;
	}
	
	
	public void addItem(int id, Item item) {
		// If the item already exists in the player's inventory, we only want to update the quantity, else we add the item as is.
		if(inventory.containsKey(id)) {
			Item i = inventory.get(id);
			i.setQuantity(i.getQuantity() + item.getQuantity());
			inventory.put(id, i);
		}
		else {
			inventory.put(id, item);
		}
	}
}
