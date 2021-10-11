package shape;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShapeFactory {
	public static List<MyRectangle> createRectangle() {

		int red = new Random().nextInt(256);
		int green = new Random().nextInt(256);
		int blue = new Random().nextInt(256);

		Color rectangleColor = new Color(red, green, blue);

		int height = new Random().nextInt(30 + 1) + 30;
		int width = new Random().nextInt(height - 1) + 30;
		
		double area = width*height;

		MyRectangle rectangleShape = new MyRectangle(25, 25, width, height, rectangleColor, area);

		List<MyRectangle> shapeList = new ArrayList<MyRectangle>();
		shapeList.add(rectangleShape);

		return shapeList;
	}

	public static List<MySquare> createSquare() {
		int red = new Random().nextInt(256);
		int green = new Random().nextInt(256);
		int blue = new Random().nextInt(256);

		Color squareColor = new Color(red, green, blue);

		int height = new Random().nextInt(30 + 1) + 30;
		int width = height;
		
		double area = width*height;
		
		MySquare squareShape = new MySquare(25, 25, width, height, squareColor, area);

		List<MySquare> shapeList = new ArrayList<MySquare>();
		shapeList.add(squareShape);

		return shapeList;
	}

	public static List<MyCircle> createCircle() {
		int red = new Random().nextInt(256);
		int green = new Random().nextInt(256);
		int blue = new Random().nextInt(256);

		Color circleColor = new Color(red, green, blue);

		int height = new Random().nextInt(30 + 1) + 30;
		int width = height;
		
		double area = Math.PI * (width/2) * (width/2);

		MyCircle circleShape = new MyCircle(25, 25, width, height, circleColor, area);

		List<MyCircle> shapeList = new ArrayList<MyCircle>();
		shapeList.add(circleShape);

		return shapeList;
	}
}
