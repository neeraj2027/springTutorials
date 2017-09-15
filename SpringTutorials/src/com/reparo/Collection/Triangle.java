package com.reparo.Collection;

import java.util.List;

public class Triangle {

	List<Point> points;

	Triangle() {
	}

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> point) {
		this.points = point;
	}

	public Triangle(List<Point> points) {
		super();
		this.points = points;
	}

	public void draw() {
		
		for (Point point : points) {
			System.out.println("Point =("+point.getX() +","+ point.getY()+")");
		}
	}
	
	

	
}
