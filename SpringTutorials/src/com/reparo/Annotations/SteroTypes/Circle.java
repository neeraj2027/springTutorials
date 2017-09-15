package com.reparo.Annotations.SteroTypes;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component //can be @service @repository @controller
public class Circle implements Shape {

	private Point center;

	public Circle() {
	}

	public Point getCenter() {
		return center;
	}
	
	@Resource
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
