package dev.game.state;

import dev.game.menu.MainMenu;
import dev.game.menu.Menu;

public class IntroState extends GameState implements State {

	private String title;
	private Menu menu;
	
	public IntroState() {
		title = "RPG TITLE HERE!";
		menu = new MainMenu();
	}
}
