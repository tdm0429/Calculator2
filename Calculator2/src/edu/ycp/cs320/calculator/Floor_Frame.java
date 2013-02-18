package edu.ycp.cs320.calculator;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

// You won't need to modify this class.
public class Floor_Frame extends JFrame {
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Floor_Frame frame = new Floor_Frame();
				frame.add(new Floor_padsPanel());
				frame.pack();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setTitle("Rocket Pads");
				frame.setVisible(true);
			}
		});
	}
}
