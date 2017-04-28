package dev.game.engine;

import java.awt.event.KeyEvent;

public class InputManager {

	KeyboardInput keyboard;
	
	public InputManager() {
		keyboard = new KeyboardInput();
	}

	public KeyboardInput getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(KeyboardInput keyboard) {
		this.keyboard = keyboard;
	}
	
	
	public void selectOption(KeyEvent e) {
		
	}
}
