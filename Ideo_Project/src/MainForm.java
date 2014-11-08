import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MainForm extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textBox_tags;
	private JTextField textBox_thought;
	private String headerText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm frame = new MainForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 436, 564);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_tags = new JLabel("Please Tag:");
		label_tags.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_tags.setBounds(60, 46, 76, 34);
		contentPane.add(label_tags);
		
		
		
		textBox_tags = new JTextField();
		textBox_tags.setBounds(60, 87, 141, 22);
		contentPane.add(textBox_tags);
		textBox_tags.setColumns(10);
		
		JButton button_Add = new JButton("Add");
		button_Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
							
				int i = 0;
				thought myThought = new thought();
				
				
				
				if (textBox_tags != null){
					myThought.set_tagList(i, textBox_tags.getText());
					//textBox_thought.
				}
				
				
				
			}
		});
		button_Add.setBounds(213, 86, 55, 25);
		contentPane.add(button_Add);
		
		textBox_thought = new JTextField();
		textBox_thought.setBounds(61, 156, 243, 258);
		contentPane.add(textBox_thought);
		textBox_thought.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(207, 427, 97, 25);
		contentPane.add(btnSave);
		
		
	}
}
