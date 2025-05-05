import java.util.Scanner;
import java.time.Year;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Year: ");
        int year = scanner.nextInt();

        if (Year.isLeap(year)) {
            System.out.print("The year is leap year.");
        } else {
            System.out.print("The year isn't leap year.");
        }
    }
}
