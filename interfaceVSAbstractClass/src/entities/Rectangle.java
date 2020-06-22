package entities;

import enums.Color;

public class Rectangle extends AbstactShape {
	
	public double width;
	public double height;
	
	public Rectangle(Color color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double area() {
		return width * height;
	}
	
	
}
