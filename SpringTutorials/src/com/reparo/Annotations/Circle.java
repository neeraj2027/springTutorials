package com.reparo.Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {

	@Autowired
	/*@Qualifier("circleRelated")*/
	@Qualifier("point1")//bean name
	private Point center;

	public Circle() {
	}

	public Point getCenter() {
		return center;
	}

/*	@Required
	public void setCenter(Point center) {//
		this.center = center;
	}*/

	public void setCenter(Point center) {
		this.center = center;
	}
	
	@Override
	public String toString() {
		return "Circle [center=" + center + "]";
	}

	public Circle(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Inside Circle draw()");
		System.out.println("Circle\n [Center PointX=" + center.getX() + "PointY=" + center.getY() + "]");
	}

}
