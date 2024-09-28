//Write a program to calculate the average of two numbers and their deviation.

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number = ");

        int num1 = scanner.nextInt();

        System.out.print("Enter second number = ");

        int num2 = scanner.nextInt();
        float avg;

        avg = (float)(num1 + num2) / 2;

        System.out.printf("Averege = %.2f\n", avg);
        System.out.println("Deviation of first number = " + ((float)num1 - avg));
        System.out.println("Deviation of first number = " + ((float)num2 - avg));

        scanner.close();
    }
}
