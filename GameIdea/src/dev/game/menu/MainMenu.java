package dev.game.menu;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainMenu implements Menu {

	private enum MAIN_MENU_OPTIONS {
		NEW_GAME, LOAD_GAME, SETTINGS
	}
	
	private final String newGame;
	private final String loadGame;
	private final String settings;
	private int selectedOptions;
	
	public MainMenu() {
		newGame = "New Game";
		loadGame = "Load Game";
		settings = "Settings";
		
	}
	
	
	@Override
	public void select() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		
	}


	
	
	
	
	
	
}
