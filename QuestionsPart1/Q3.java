//Write a program to read a character in upper case and then print it in lower case.

import java.util.Scanner;

public class Q3 {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Character in Upper case:");
        char Check = scanner.next().charAt(0);
        int val = (int)Check;

        if (val > 64 && val < 92) {
            val = val - 65;
            val = 97 + val;

            System.out.printf("Lower case: %c", val);
        }

        scanner.close();
    }
}
