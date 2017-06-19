package dev.game.engine;

import java.util.Stack;

import dev.game.state.IntroState;
import dev.game.state.State;
import dev.game.state.StateManager;

/** Main game class. The start of the entire game.
 * 
 * @author TSok
 *
 */
public class Game {
	
	StateManager stateManager;
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
		stateManager = new StateManager();
		stateManager.init();
		
		
	}
	
	/**
	 * 
	 */
	private void update() {
		stateManager.update();
	}
	
	/**
	 * 
	 */
	private void draw() {
		stateManager.draw();
		
	}
	
	/**
	 * 
	 */
	private void processInput() {
		stateManager.processInput();
	}
}
