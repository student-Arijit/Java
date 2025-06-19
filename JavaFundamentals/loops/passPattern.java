package loops;

public class passPattern {
    public static void main(String[] args){
        for (int i = 0; i < 5; i++) {
            System.out.print("Pass " + (i+1) + "- ");
            for (int j = 0; j < 5; j++) {
                System.out.print((j+1) + " ");
            }
            System.out.print("\n");
        }
    }
}
