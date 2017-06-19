package dev.game.entity;

import java.util.List;
/** Strong buff. This buff makes your defense and attack stronger for some time
 * 
 * @author TSok
 *
 */
public class StrongBuff {

	private String name;
	// How long the buff lasts. The last turn of the duration, the effect ends at the end of the turn.
	private int duration;
	
	public StrongBuff() {
		name = "Strong";
		duration = 5;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public void apply(Stats s) {
		s.defense = (int) (s.defense * 1.75);
		s.strength = (int) (s.strength * 1.5);
	}
}
