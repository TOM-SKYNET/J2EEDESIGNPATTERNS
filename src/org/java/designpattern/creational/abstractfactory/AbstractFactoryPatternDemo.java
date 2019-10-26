package org.java.designpattern.creational.abstractfactory;

import org.java.designpattern.creational.common.Color;
import org.java.designpattern.creational.common.Shape;

/**
 * Abstract Factory patterns work around a super-factory which creates other
 * factories. This factory is also called as factory of factories. This type of
 * design pattern comes under creational pattern as this pattern provides one of
 * the best ways to create an object. In Abstract Factory pattern, an interface
 * is responsible for creating a factory of related objects without explicitly
 * specifying their classes. Each generated factory can give the objects as per
 * the Factory pattern.
 */

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {

		AbstractFactory shapeFactory = FactoryGenerator.getFactory("SHAPE");
		Shape circle = shapeFactory.getShape("CIRCLE");
		circle.draw();
		
		Shape rectangle = shapeFactory.getShape("rectangle");
		rectangle.draw();
		
		
		AbstractFactory colorFactory = FactoryGenerator.getFactory("COLOR");
		Color green = colorFactory.getColor("GREEN");
		green.fill();
		
	}

}
