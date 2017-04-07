package dev.game.entity;

import java.io.File;

public abstract class Entity {
	
	protected String name;
	
	public Entity() {
		
	}
	
	public Entity(File file) {
		
	}
	
	public Entity(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
