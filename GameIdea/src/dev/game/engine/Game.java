package dev.game.engine;

import dev.game.state.GameState;
import dev.game.state.IntroState;

/** Main game class. The start of the entire game.
 * 
 * @author Sok
 *
 */
public class Game {
	
	GameState state;
	private boolean running;
	
	/**
	 * 
	 */
	public Game() {
		
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
		state = new IntroState();
	}
	
	/**
	 * 
	 */
	private void update() {
		
	}
	
	/**
	 * 
	 */
	private void draw() {
		
		
	}
	
	/**
	 * 
	 */
	private void processInput() {
		
	}
}
