package dev.game.state;

import java.util.Stack;

/**Manages the state the game is in. States the game can be in are Combat, World Map, Point of Interest, Cutscene...
 * 
 * @author Sok
 *
 */
public class StateManager {

	Stack<State> stateStack;
	State currentState;
	
	public StateManager() {
		this.init();
	}
	
	public void init() {
		stateStack = new Stack<State>();
		currentState = new IntroState();
		
		stateStack.push(currentState);
	}
	
	
	// Switch between states...pop the state we are moving into onto the stack
	public void transition(State state) {
		currentState = state;
		stateStack.push(currentState);
	}
	
	public void update() {
		stateStack.peek().update();
		currentState.update();
	}
	
	public void draw() {
		stateStack.peek().update();
		currentState.draw();
	}
	
	public void processInput() {
		stateStack.peek().update();
		currentState.processInput();
	}
}
