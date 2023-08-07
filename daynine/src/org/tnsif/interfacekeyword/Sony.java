package org.tnsif.interfacekeyword;
//Program to demonstrate on an Interface
public interface Sony {
	int noOfChannels=9;
	void display();
	
	static void accept() {
		System.out.println("Static Method");
	}
	
	default void show() {
		System.out.println("Default Method");
	}
}
