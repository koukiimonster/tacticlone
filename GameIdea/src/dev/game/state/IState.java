package dev.game.state;

/** The interface for the state objects. All state objects will maintain control over the 
 *  entities that are relevant to that state. You can think of state as being another screen
 *  in the game. 
 * @author TSok
 *
 */
public interface IState {

	
	public void update();
	public void draw();
	public void processInput();
}
