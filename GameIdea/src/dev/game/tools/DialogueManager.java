package dev.game.tools;

import dev.game.entity.Entity;

/** Manages the dialogue sequences. Binds the dialogue to the specific actors in the scene
 * 
 * @author sok
 *
 */
public class DialogueManager {

	Dialogue dia;
	Entity e;			// used to get dialogues by entity IDs?
	
	public DialogueManager() {
		
	}
	
	public void playDialogue() {
		dia.getSpeaker();
		dia.getDialogue();
		
	}
	
	
}
