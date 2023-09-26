package org.tnsif.looping;
import java.util.Scanner;
public class WhileExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		//printing num to 1
		while(num>=1)
		{
			System.out.print(num+" ");
			num--;
		}
	}

}