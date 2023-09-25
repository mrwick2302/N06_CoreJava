package org.tnsif.checkedexpection;
//Program to demonstrate checked exception
import java.io.FileInputStream;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		try {
		FileInputStream f=new FileInputStream("D:\\GitHub\\hello.txt");
		System.out.println("File Exists!!!");
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled: "+e);
		}
	}
}
