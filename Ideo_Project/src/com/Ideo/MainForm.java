package com.Ideo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainForm {

	private JFrame frame;
	private JTextField textField_tag;
	private JTextField textField_thought;
		public JFrame Frame(){ return this.frame; }

	
	public MainForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 485, 515);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button_Save = new JButton("Save");
		button_Save.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_Save.setBounds(152, 391, 165, 47);
		frame.getContentPane().add(button_Save);
		
		JButton button_Add = new JButton("Add");
		button_Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		button_Add.setBounds(202, 64, 64, 25);
		frame.getContentPane().add(button_Add);
		
		JLabel label_PleaseTag = new JLabel("Please Tag:");
		label_PleaseTag.setFont(new Font("Traditional Arabic", Font.PLAIN, 15));
		label_PleaseTag.setBounds(71, 37, 85, 39);
		frame.getContentPane().add(label_PleaseTag);
		
		textField_tag = new JTextField();
		textField_tag.setBounds(71, 65, 128, 22);
		frame.getContentPane().add(textField_tag);
		textField_tag.setColumns(10);
		
		textField_thought = new JTextField();
		textField_thought.setBounds(71, 128, 328, 250);
		frame.getContentPane().add(textField_thought);
		textField_thought.setColumns(10);
		
		JLabel label_tagsPostAddition = new JLabel("Tags:");
		label_tagsPostAddition.setBounds(71, 99, 46, 16);
		frame.getContentPane().add(label_tagsPostAddition);
		
		JLabel label_addedTags = new JLabel("");
		label_addedTags.setBounds(114, 78, 285, 37);
		frame.getContentPane().add(label_addedTags);
	}
}
