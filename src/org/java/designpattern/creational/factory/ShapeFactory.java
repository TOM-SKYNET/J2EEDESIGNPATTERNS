package org.java.designpattern.creational.factory;

import org.java.designpattern.creational.common.Circle;
import org.java.designpattern.creational.common.Rectangle;
import org.java.designpattern.creational.common.Shape;
import org.java.designpattern.creational.common.Square;

public class ShapeFactory {
	
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if("CIRCLE".equalsIgnoreCase(shapeType)) {
			return new Circle();
		} else if("RECTANGLE".equalsIgnoreCase(shapeType)) {
			return new Rectangle();
		} else if("SQUARE".equalsIgnoreCase(shapeType)) {
			return new Square();
		}
		return null;
	}
}
