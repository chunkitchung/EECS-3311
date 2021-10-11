package shape;

import java.awt.Color;
import java.awt.Graphics;

public class MyRectangle extends Shape implements Comparable<MyRectangle> {

	protected int upperX;
	protected int upperY;
	protected int width;
	protected int height;
	protected Color shapeColor;
	protected double area;

	/**
	 * Class's constructor
	 * 
	 * @param upperX
	 * @param upperY
	 * @param width
	 * @param height
	 * @param shapeColor
	 */
	public MyRectangle(int upperX, int upperY, int width, int height, Color shapeColor, double area) {
		super(upperX, upperY, width, height, shapeColor, area);
	}

	@Override
	public int compareTo(MyRectangle o) {
		// TODO write the right Java code here to support the comparison
		return 0;
	}

	/**
	 * Method to draw a rectangle
	 * 
	 * @param form
	 */
	public void drawShape(Graphics form) {
		form.fillRect(upperX, upperY, width, height);
	}

	// getters
	public Color getColor() {
		return shapeColor;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getUpperX() {
		return upperX;
	}

	public int getUpperY() {
		return upperY;
	}
	
	public double getArea() {
		return height*width;
	}

	// setters
	public void setColor(Color aShapeColor) {
		this.shapeColor = aShapeColor;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setUpperX(int upperX) {
		this.upperX = upperX;
	}

	public void setUpperY(int upperY) {
		this.upperY = upperY;
	}
	
	public void setArea(double area) {
		this.area = area;
	}

}
