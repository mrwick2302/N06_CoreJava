package org.tnsif.wrapperclass;
//Program to Demonstrate to AutoBoxing
/*AutoBoxing : Conversion of primative to object type*/
public class AutoBoxing {

	public static void main(String[] args) {
		int num=97;
		//converting a primative type to object
		Integer value=num;
		System.out.println(value);
		System.out.println(value.getClass().getName());

	}

}
