package com.Ideo;




public class program {

	public static void main(String[] args) {
		/*
		// Below method creates an instance of the MainForm Object.  The MainForm() constructor simply calls 
	 	Mainform.InitializeComponent(), which builds the form.  InitializeComponent can be manipulated in a GUI with 
		 WindowBuilder addon, and by rightclicking the Mainform.java file and selecting "open with WindowBuilder ...something.."
		in the project explorer
		 * 
		 */
		MainForm mainform = new MainForm();
		mainform.Frame().setVisible(true);
		
		
	}

}
