package dev.game.tools;

import java.io.File;

public class Dialogue {

	// Holds the actual dialogue being spoken
	private String dialogue;
	// name of the character saying the dialogue
	private String speaker;
	
	public Dialogue() {
		
	}
	
	// Dialogue information and content provided through some file
	public Dialogue(File file) {
		
		
	}
	
	public String getDialogue() {
		return this.dialogue;
	}
	
	public void setDialogue(String d) {
		this.dialogue = d;
	}
	
	
	public String getSpeaker() {
		return this.speaker;
	}
	
	public void setSpeaker(String s) {
		this.speaker = s;
	}
	
}
