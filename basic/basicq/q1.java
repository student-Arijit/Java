//sum of two numbers
import java.util.Scanner;

public class sum{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number:");
        int num1 = scanner.nextInt();
        System.out.print("enter a number:");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.print("sum is " + sum);
        scanner.close();
    }
}
