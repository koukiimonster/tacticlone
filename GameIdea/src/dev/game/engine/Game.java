package dev.game.engine;

import java.util.Stack;

import dev.game.state.IntroState;
import dev.game.state.State;

/** Main game class. The start of the entire game.
 * 
 * @author TSok
 *
 */
public class Game {
	
	//StateManager stateManager;
	State currentState;
	Stack<State> stateStack;
	private InputManager inputManager;
	private boolean running;
	
	/**
	 * 
	 */
	public Game() {
		//this.init();
		this.run();
	}
	
	public void run() {
		running = true;
		
		init();
		
		while(running) {
			processInput();
			update();
			draw();
		}
		
	}
	
	/**
	 * 
	 */
	public void init() {
		stateStack = new Stack<State>();
		//stateManager = new StateManager();
		currentState = new IntroState();
		inputManager = new InputManager();
		stateStack.push(currentState);
		
		// Sets the initial state to the intro
		//stateManager.init();
		//currentState
	}
	
	/**
	 * 
	 */
	private void update() {
		currentState.update();
	}
	
	/**
	 * 
	 */
	private void draw() {
		currentState.draw();
		
	}
	
	/**
	 * 
	 */
	private void processInput() {
		currentState.processInput();
	}
}
