package dev.game.map;

public class TileMap {

	Tile[][] map;
	
	public TileMap() {
		
	}
	
	public TileMap(String fileName) {
 
	}
	
	public Tile getTile(int x, int y) {
		return map[x][y];
	}
	
	
 }
