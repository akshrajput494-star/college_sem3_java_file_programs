// Console calculator — use Scanner for input and System.out.printf for formatted output.

import java.util.Scanner;

public class problem_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter subtotal: ");
        double subtotal = sc.nextDouble();
        
        System.out.print("Enter tax percentage: ");
        double taxRate = sc.nextDouble();
        
        System.out.print("Enter tip percentage: ");
        double tipRate = sc.nextDouble();
        
        System.out.print("Enter number of people to split: ");
        int people = sc.nextInt();

        double tax = subtotal * (taxRate / 100);
        double tip = subtotal * (tipRate / 100);
        double total = subtotal + tax + tip;
        double splitAmount = total / people;

        System.out.println("\n--- RECEIPT ---");
        System.out.printf("Subtotal:  $%8.2f%n", subtotal);
        System.out.printf("Tax:       $%8.2f%n", tax);
        System.out.printf("Tip:       $%8.2f%n", tip);
        System.out.printf("Total:     $%8.2f%n", total);
        System.out.printf("Per Person:$%8.2f%n", splitAmount);

        sc.close();
    }
}