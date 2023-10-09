package org.tnsif.thiskeyworddemo;

class Director{
	String name;
	
	void print() {
		this.name="Sunil Dutt";
		display(name);
	}
	void display(String Name) {
		System.out.println("Director name is : "+name);
	}
}

public class ThisKeywordDemoFour {

	public static void main(String[] args) {
		Director d= new Director();
		d.print();

	}

}