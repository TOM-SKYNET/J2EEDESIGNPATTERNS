package org.java.designpattern.creational.singleton;

public class SingleObject {
	
	private static SingleObject instance = null;
	private SingleObject() { }
	
	public static SingleObject getInstance() {
		return instance != null ? instance : new SingleObject();
	}
	
	public void showMessage(){ 
		System.out.println("Singleton Pattern");
	}
}
