//Write a program to swap two numbers using a temporary variable.

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");

        int val1 = scanner.nextInt();

        System.out.print("Enter the second number: ");

        int val2 = scanner.nextInt();
        int temp;

        temp = val1;
        val1 = val2;
        val2 = temp;

        System.out.println("Number1 : " + val1);
        System.out.println("Number2 : " + val2);

        scanner.close();
    }
}
