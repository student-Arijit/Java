import java.util.Scanner;

public class vowelorconsonant{
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c ==  'o' || c == 'u';
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Character: ");
        char ch = sc.next().charAt(0);

        if (isVowel(ch)) {
            System.out.print("The Character is Vowel.");
        } else {
            System.out.print("The Character is consonant.");
        }
    }
}
