package dev.game.state;

import dev.game.engine.InputManager;
import dev.game.menu.MainMenu;
import dev.game.menu.Menu;

public class IntroState extends GameState implements State {

	private String title;
	private Menu menu;
	private InputManager inputManager;
	
	public IntroState() {
		title = "RPG TITLE HERE!";
		menu = new MainMenu();
		inputManager = new InputManager();
	}
	
	// update logical data...keyboard inputs etc
	@Override
	public void update() {
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processInput() {
		// TODO Auto-generated method stub
	}
	
}
