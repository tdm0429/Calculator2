package edu.ycp.cs320.calculator;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

// You won't need to modify this class.
public class RocketPadsFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				RocketPadsFrame frame = new RocketPadsFrame();
				frame.add(new RocketPadsPanel());
				frame.pack();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setTitle("Rocket Pads");
				frame.setVisible(true);
			}
		});
	}
}
