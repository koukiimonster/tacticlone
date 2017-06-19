package dev.game.menu;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import dev.game.state.LoadGameState;
import dev.game.state.NewGameState;
import dev.game.state.SettingsState;
import dev.game.state.State;

public class SimpleMenu implements KeyListener {

	private String[] options;
	private int current;
	
	public SimpleMenu() {
		options[0] = "New game";
		options[1] = "Load game";
		options[2] = "Settings";
		options[3] = "Quit game";
		
		current = 0;
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			if(current == 3) {
				current = 3;
			}
			else {
				current += current;
			}
		}
		
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			if(current == 0) {
				current = 0;
			}
			else {
				current -= current;
			}
		}
		
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			execute(current);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public State execute(int selected) {
		switch(selected) {
		
		case 0:
		{
			return new NewGameState();
		}
		case 1: 
		{
			return new LoadGameState();
		}
		case 2:
		{
			return new SettingsState();
		}
		case 3:
		{
			closeGame();
		}
			
		}
		return null;
	}
	
	private void closeGame() {
		
	}
}
