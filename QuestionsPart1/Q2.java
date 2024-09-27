import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character to find ASCII:");
        char Check = scanner.next().charAt(0);
        int a = (int)Check;

        System.out.println("The ASCII value of '" + Check + "' is = " + a);

        scanner.close();
    }
}
