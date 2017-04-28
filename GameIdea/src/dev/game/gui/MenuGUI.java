package dev.game.gui;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.image.BufferedImage;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

import dev.game.state.State;

public class MenuGUI {

	BufferedImage image;
	Canvas canvas;
	int width = 600;
	int height = 400;
	
	public MenuGUI() {
		JFrame frame = new JFrame("GameTest");
		frame.setSize(width, height);
		//frame.setLayout(new GroupLayout());
		JButton startGame = new JButton();
		startGame.setText("New Game");
		startGame.setBackground(Color.WHITE);
		//startGame.set
		JButton options = new JButton();
		options.setText("Options");
		JButton quit = new JButton();
		quit.setText("Quit");
		
		frame.add(startGame);
		frame.add(options);
		frame.add(quit);
		
		//frame.addKeyListener();
		frame.setVisible(true);
	}
	
	public MenuGUI(State state) {
		
	}
	
	
	
}
