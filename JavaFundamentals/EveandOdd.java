import java.util.Scanner;

public class EveandOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        System.out.printf("%s", ((num & 1) == 1)? "It's a odd Number." : "It's a even Number.");
    }
}
