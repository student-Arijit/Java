import java.util.Scanner;

public class Area {
    public static final double PI = 3.14d;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the radius of a circle: ");
        
        float Radius = scanner.nextFloat();
        double Area = PI * Math.pow(Radius, 2);
        
        System.out.printf("The area of the circle of the raius %.2f", Area);
    }
}
