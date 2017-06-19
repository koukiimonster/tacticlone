package dev.game.tools;

public class Tile {

	private Coordinate coordinate;
	
	private boolean isWalkable;		// determines if an entity can pass over this tile
	private boolean isFlammable;	// determines if this tile will deal extra fire damage
	private boolean isWater;		// determines if this tile will deal extra lightning damage
	private boolean isSoluble;		// determines if this tile will deal extra water damage
	private int height;				// height of the tile
	private TILE_TYPE type;			// enum for tile type
	
	public Tile() {
		
	}
	
	public Tile(int x, int y) {
		coordinate.setX(x);
		coordinate.setY(y);
	}
	
	public Coordinate getCoordinate() {
		return coordinate;
	}
	
	
}
