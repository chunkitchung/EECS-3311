package shape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyPanel extends JPanel {

	static int counter = 0;

	/**
	 * This is the main method of the class.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		MyPanel rects = new MyPanel();
		JFrame frame = new JFrame("Display shapes");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(rects);
		frame.setSize(600, 600);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		JButton LoadButton = new JButton("Load shapes");
		LoadButton.setBounds(200, 10, 95, 30);
		rects.add(LoadButton);
		LoadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				// for (int i = 0; i < 6; i++) {
//				int randNumber = new Random().nextInt(2);
//				if (randNumber == 0) {
//					// calling the method that creates rectangle
//					List<MyRectangle> rectangleList = ShapeFactory.createRectangle();
//					
//					ColourShape colourshape = new ColourShape();
//				
//
//				} else if (randNumber == 1) {
//					// calling the method that creates square
//					List<MySquare> squareList = ShapeFactory.createSquare();
//					ColourShape colourshape = new ColourShape();
//
//				} else {
//					// calling the method that creates square
//					List<MyCircle> circleList = ShapeFactory.createCircle();
//					ColourShape colourshape = new ColourShape();
//				}
				// }
				
				List<MyRectangle> rectangleList = ShapeFactory.createRectangle();
				
				ColourShape colourshape = new ColourShape();
				
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.add(rects);
				frame.setSize(600, 600);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});

		JButton SortShapes = new JButton("Sort shapes");
		SortShapes.setBounds(300, 10, 95, 30);
		rects.add(SortShapes);
		SortShapes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
			}
		});
	
	}
}
