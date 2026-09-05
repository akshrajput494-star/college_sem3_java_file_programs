//Array toolkit — implement linear search, bubble sort, and matrix multiplication on 1D and 2D arrays

import java.util.Scanner;
public class problem_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Array Reversal
        System.out.print("Enter array size N: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        System.out.print("Reversed: ");
        for(int i=n-1; i>=0; i--) System.out.print(arr[i] + " ");
        
        // Book Borrowing Report
        System.out.print("\nEnter total books: ");
        int books = sc.nextInt();
        sc.nextLine(); // Consume newline
        String[] titles = new String[books];
        String longest = "";
        
        for (int i = 0; i < books; i++) {
            System.out.print("Enter book title: ");
            titles[i] = sc.nextLine();
            if (titles[i].length() > longest.length()) longest = titles[i];
        }
        
        System.out.println("\n--- Borrowing Report ---");
        for (int i = 0; i < books; i++) {
            System.out.println("Book " + (i + 1) + ": " + titles[i]);
        }
        System.out.println("Total books: " + books);
        System.out.println("Longest title: " + longest);
        sc.close();
    }
}

