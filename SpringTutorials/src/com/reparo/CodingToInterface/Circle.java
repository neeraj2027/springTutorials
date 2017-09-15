package com.reparo.CodingToInterface;

public class Circle implements Shape {

	private Point center;

	public Circle() {
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public String toString() {
		return "Circle [center=" + center + "]";
	}

	public Circle(Point center) {
		super();
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Inside Circle draw()");
		System.out.println("Circle\n [Center Point=" + center + "]");
	}

}
