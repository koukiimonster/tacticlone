package dev.game.menu;

public class MainMenu extends Menu {

	private enum MAIN_MENU_OPTIONS {
		NEW_GAME, LOAD_GAME, SETTINGS
	}
	
	private final String newGame;
	private final String loadGame;
	private final String settings;
	public MainMenu() {
		newGame = "New Game";
		loadGame = "Load Game";
		settings = "Settings";
		
	}
	
	
	
	
}
