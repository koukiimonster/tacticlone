package dev.game.state;


import java.util.List;

import dev.game.menu.MainMenu;
import dev.game.menu.Menu;

public class IntroState extends State {

	private String title;
	private Menu menu;
	//private List<InputListenerComponent> inputListeners;
	
	public IntroState() {
		title = "RPG TITLE HERE!";
		menu = new MainMenu();
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
