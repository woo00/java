package day14;

import javax.swing.*;

public class Test00 {
	JFrame fr;
	public Test00() {
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		setSize(400, 300);
//		setVisible(true);
		fr = new JFrame();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		fr.setSize(400, 300);
		fr.setVisible(true);
	}

	public static void main(String[] args) {
		new Test00();
	}

}
