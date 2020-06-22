package entities;

import enums.Color;

public abstract class AbstactShape implements Shape {
	
	private Color color;

	public AbstactShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
