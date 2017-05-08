package dev.game.item;

public class Equipment extends Item {

	public enum EQUIP_TYPE {
		RHAND, LHAND, HEAD, BODY, ARMS, FEET, ACCESSORY, ACCESSORY_2
	}
	private boolean isEquipped;
	private int type;
	
	
	
	public Equipment() {
		
	}
	
	public Equipment(String name, int type, int price) {
		this.setName(name);
		this.setPrice(price);
		this.type = type;
	}

	public boolean isEquipped() {
		return isEquipped;
	}

	public void setEquipped(boolean isEquipped) {
		this.isEquipped = isEquipped;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	
}
