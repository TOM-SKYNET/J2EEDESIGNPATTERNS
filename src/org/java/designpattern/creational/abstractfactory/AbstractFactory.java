package org.java.designpattern.creational.abstractfactory;

import org.java.designpattern.creational.common.Color;
import org.java.designpattern.creational.common.Shape;

public abstract class AbstractFactory {
	abstract Color getColor(String color);
	abstract Shape getShape(String shapeType);
}
