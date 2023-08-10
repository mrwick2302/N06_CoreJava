package org.tnsif.multidimensionalarray;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//2d array declaration
		System.out.println("Enter the array elements: ");
		int arr[][]=new int[3][2];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		//Printing an array elements
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
