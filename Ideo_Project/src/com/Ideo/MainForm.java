package com.Ideo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

public class MainForm {

	private JFrame frame;
		public JFrame Frame(){ return this.frame; }

	
	public MainForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(154, 172, 97, 25);
		frame.getContentPane().add(btnNewButton);
	}
}
