package dev.game.driver;

import dev.game.state.CombatState;
import dev.game.state.State;

/** Tool to test the battle system
 * 
 * @author Sok
 *
 */
public class BattleTester {

	State state;
	
	public BattleTester() {
		state= new CombatState();
	}
	
}
