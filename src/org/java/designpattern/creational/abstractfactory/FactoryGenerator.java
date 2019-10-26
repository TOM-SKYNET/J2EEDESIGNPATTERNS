package org.java.designpattern.creational.abstractfactory;

public class FactoryGenerator {

	public static AbstractFactory getFactory(String choice) {
		
		if("SHAPE".equalsIgnoreCase(choice)) {
			return new ShapeFactory();
		} 
		if("COLOR".equalsIgnoreCase(choice)) {
			return new ColorFactory();
		}
		return null;
	}
}
