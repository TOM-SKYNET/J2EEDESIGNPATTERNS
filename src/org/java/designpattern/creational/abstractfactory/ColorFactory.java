package org.java.designpattern.creational.abstractfactory;

import org.java.designpattern.creational.common.Blue;
import org.java.designpattern.creational.common.Color;
import org.java.designpattern.creational.common.Green;
import org.java.designpattern.creational.common.Red;
import org.java.designpattern.creational.common.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		if("RED".equalsIgnoreCase(color)) {
			return new Red();
		}
		if("BLUE".equalsIgnoreCase(color)) {
			return new Blue();
		}
		if("GREEN".equalsIgnoreCase(color)) {
			return new Green();
		}
		return null;
	}

	@Override
	Shape getShape(String shapeType) {
		return null;
	}

}
