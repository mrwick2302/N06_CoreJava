package org.tnsif.customexpection;
//Program to demonstrate on custom exception
/*to use custom exception extends an Exception class(parent)*/

public class LoginCredentials extends Exception{
	
	private String str;
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	LoginCredentials(String str) {
		super();
		this.str=str;
	}

	@Override
	public String toString() {
		return "LoginCredentials [str=" + str + "]";
	}
	
}
