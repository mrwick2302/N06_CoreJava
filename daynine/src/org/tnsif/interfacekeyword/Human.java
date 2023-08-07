package org.tnsif.interfacekeyword;
//implementable class
public class Human implements ColdDrink,AlcoholDrinks{

	@Override
	public void showDrink() {
		System.out.println(colddrinkName+" "+alcoholType+" "+brand);
		
	}
	
}
