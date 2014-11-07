import javax.swing.JFrame;
import javax.swing.JLabel;


public class form extends JFrame {
	
	JLabel label;
	

	form(String title){
		super(title);
		setSize(800,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = new JLabel("Tag your Thought");
		
		add(label);
		
	}
	
}
