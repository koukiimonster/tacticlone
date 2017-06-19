package dev.game.gui;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

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
		JPanel optionsPanel = new JPanel();
		optionsPanel.setLayout(new GridLayout(4, 0));
		//optionsPanel.
		JButton startGame = new JButton();
		startGame.setText("New Game");
		startGame.setPreferredSize(new Dimension(80, 50));
		startGame.setBackground(Color.WHITE);
		//startGame.set
		JButton options = new JButton();
		options.setText("Options");
		options.setPreferredSize(new Dimension(80, 50));
		JButton quit = new JButton();
		quit.setText("Quit");
		quit.setPreferredSize(new Dimension(80, 50));
		optionsPanel.add(startGame);
		optionsPanel.add(options);
		optionsPanel.add(quit);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(optionsPanel);
		
		//frame.addKeyListener();
		frame.setVisible(true);
	}
	
	public MenuGUI(State state) {
		
	}
	
	
	
}
