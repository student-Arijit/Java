import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isUpperCase(ch)) {
            ch = Character.toLowerCase(ch);
        } else {
            ch = Character.toUpperCase(ch);
        }

        System.out.print("Converted character: " + ch);
    }
}
