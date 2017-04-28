package dev.game.map;

public class WorldMap {

	
	Node[] nodes;				// List of all active nodes of the world map
	Node currentNode;			// current node the player is on
	
	
	public WorldMap() {
		
	}
	
	public void move(Node destination) {
		currentNode = destination;
	}
	
	
}
