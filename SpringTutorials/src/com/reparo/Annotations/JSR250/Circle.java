package com.reparo.Annotations.JSR250;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {

	/*@Resource(name="point2")*/
	@Resource//name the bean as the name of member variable i.e. center
	private Point center;

	public Circle() {
	}

	public Point getCenter() {
		return center;
	}

/*	@Required
	public void setCenter(Point center) {
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
	
	@PostConstruct
	public void initCircle() {
		System.out.println("init circle is called");
	}
	
	@PreDestroy
	public void destroyCircle() {
		System.out.println("destroy circle is called");
	}

	@Override
	public void draw() {
		System.out.println("Inside Circle draw()");
		System.out.println("Circle\n [Center PointX=" + center.getX() + "PointY=" + center.getY() + "]");
	}

}
