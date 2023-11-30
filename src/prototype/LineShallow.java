package prototype;

import java.awt.Color;
import java.awt.Graphics;

import mvc.Point;
import mvc.Shape;

public class LineShallow extends Shape implements Cloneable {
	private Point startPoint = new Point();
	private Point endPoint = new Point();
	private Color color;
	
	public LineShallow() { 
		
	}
	
	public LineShallow(Point startPoint, Point endPoint, Color color) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		this.color = color;
	}

	public Point getStartPoint() {
		return startPoint;
	}



	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}



	public Point getEndPoint() {
		return endPoint;
	}



	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}



	public Color getColor() {
		return color;
	}



	public void setColor(Color color) {
		this.color = color;
	}
	
	//--- Kreiranje shallow copy izrade prototipa (1. način) ----
	public LineShallow clone() {
		try {
			return (LineShallow) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}


	@Override
	public String toString() {
		return "Line [startPoint=" + startPoint + ", endPoint=" + endPoint + ", color=" + color + "]";
	}

	public void draw(Graphics g) {
		//implementacija
	}
	

}
