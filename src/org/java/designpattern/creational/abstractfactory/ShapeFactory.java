package org.java.designpattern.creational.abstractfactory;

import org.java.designpattern.creational.common.Circle;
import org.java.designpattern.creational.common.Color;
import org.java.designpattern.creational.common.Rectangle;
import org.java.designpattern.creational.common.Shape;
import org.java.designpattern.creational.common.Square;

public class ShapeFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		return null;
	}

	@Override
	Shape getShape(String shapeType) {
		
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
