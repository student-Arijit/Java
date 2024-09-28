//Write a program to print the digit at ones place of a number.

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a integer number: ");
        int val = scanner.nextInt();
        int rem;

        rem = val % 10;

        System.out.println("The digit at ones place: " + rem);

        scanner.close();
    }
}