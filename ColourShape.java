package shape;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class ColourShape extends JPanel {

	private List<MyRectangle> rectangleList = new ArrayList<MyRectangle>();
	private List<MySquare> squareList = new ArrayList<MySquare>();
	private List<MyCircle> circleList = new ArrayList<MyCircle>();

	public ColourShape() {
		  
		 
		
	}

	public void paintRectangle(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		for (MyRectangle shape : rectangleList) {
			g2d.setColor(shape.getColor());
			shape.drawShape(g2d);
		}
	}

	public void colourSquare(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		for (MySquare shape : squareList) {
			g2d.setColor(shape.getColor());
			shape.drawShape(g2d);
		}
	}

	public void colourCircle(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		for (MyCircle shape : circleList) {
			g2d.setColor(shape.getColor());
			shape.drawShape(g2d);
		}
	}

}
