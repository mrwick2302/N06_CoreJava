package org.tnsif.assignment;

import java.util.Scanner;

public class Executor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int[] pinkyNumbers = new int[n];
        int[] maryNumbers = new int[n];

        System.out.println("Numbers said by Pinky:");
        for (int i = 0; i < n; i++) {
            pinkyNumbers[i] = scanner.nextInt();
        }

        System.out.println("Numbers said by Mary:");
        for (int i = 0; i < n; i++) {
            maryNumbers[i] = scanner.nextInt();
        }

        orderchecker checker = new orderchecker();
        boolean isCorrect = checker.isReverseOrderCorrect(n, pinkyNumbers, maryNumbers);

        if (isCorrect) {
            System.out.println("Yes, it is in reverse order");
        } else {
            System.out.println("No, it is not in reverse order");
        }

        scanner.close();
    }

}
