package org.tnsif.customexpection;
import java.util.Scanner;
//Program to custom Exception 
public class CustomExceptionExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String userid=s.nextLine();
		String password=s.nextLine();
		try {
			if(userid.equals("mrwick@gmail.com")&& password.equals("Pass@123"))
			{
				System.out.println("Credentials are matched!!");
			}
			else
			{
				throw new LoginCredentials("Invalid Credentials!!");
			}
		}
		catch(LoginCredentials e)
		{
			System.out.println("Exception handled:" +e);
		}
	}

}
