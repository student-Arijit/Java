//Write a program to swap two numbers without using a temporary variable.

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");

        int val1 = scanner.nextInt();

        System.out.print("Enter second number: ");

        int val2 = scanner.nextInt();

        val1 = val1 ^ val2;
        val2 = val1 ^ val2;
        val1 = val1 ^ val2;

        System.out.println("number1 : " + val1);
        System.out.println("number2 : " + val2);    

        scanner.close();
    }
}
