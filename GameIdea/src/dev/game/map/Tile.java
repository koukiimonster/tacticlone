package dev.game.map;

public class Tile {

	private String type;			// tile type
	private int typeID;				// ID for tile 
	
	private float height;			// height value of the tile
	
	private boolean isWalkable;		// flag for if it is walkable or not
	
	public Tile() {
		
	}
	
	public Tile(String type, int typeID, float height) {
		this.type = type;
		this.typeID = typeID;
		this.height = height;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTypeID() {
		return typeID;
	}

	public void setTypeID(int typeID) {
		this.typeID = typeID;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public boolean isWalkable() {
		return isWalkable;
	}

	public void setWalkable(boolean isWalkable) {
		this.isWalkable = isWalkable;
	}
	
	
	
}
