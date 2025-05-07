import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your percentile: ");
        int grade = scanner.nextInt();

        System.out.printf("%s", (grade >= 75) ? "DISTINCTION." : (grade >= 60) ? "FIRST DIVISION." : (grade >= 50) ? "SECOND DIVISION." : (grade >= 40) ? "THIRD DIVISION." : "FAIL.");
    }
}
