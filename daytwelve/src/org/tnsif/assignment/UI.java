package org.tnsif.assignment;

import java.util.Scanner;

public class UI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Customer Name");
        String customerName = scanner.nextLine();
        System.out.println("Enter Phone Number");
        long phoneNumber = scanner.nextLong();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter address");
        String address = scanner.nextLine();

        System.out.println("Enter Bero Type");
        String beroType = scanner.nextLine();

        if (beroType.equals("Steel Bero")) {
            System.out.println("Enter Bero Colour");
            String beroColour = scanner.nextLine();
            System.out.println("Enter Bero Height");
            int beroHeight = scanner.nextInt();
            SteelBero steelBero = new SteelBero(beroType, beroColour, beroHeight);
            double discountAmount = new Discount().calculateDiscount(steelBero);
            double totalPrice = steelBero.getPrice() - discountAmount;
            System.out.printf("Amount needs to be paid %.2f%n", totalPrice);
        } else if (beroType.equals("Wooden Bero")) {
            System.out.println("Enter Bero Colour");
            String beroColour = scanner.nextLine();
            System.out.println("Enter Wood Type");
            String woodType = scanner.nextLine();
            WoodenBero woodenBero = new WoodenBero(beroType, beroColour, woodType);
            double discountAmount = new Discount().calculateDiscount(woodenBero);
            double totalPrice = woodenBero.getPrice() - discountAmount;
            System.out.printf("Amount needs to be paid %.2f%n", totalPrice);
        } else {
            System.out.println(beroType + " is an invalid bero type");
        }

        scanner.close();
    }
}

