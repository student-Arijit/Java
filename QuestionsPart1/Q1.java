//Write a program to calculate the area of a circle
import java.util.Scanner;

public class Q1 {
    public static final double PI = 3.14d;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the radius of a circle: ");
        
        float Radius = scanner.nextFloat();
        double Area = areaOfCircle(Radius);
        
        System.out.printf("The area of the circle of the raius %.2f", Area);
        
        scanner.close();
    }
    
    public static double areaOfCircle(float Radius) {
        return PI * Math.pow(Radius, 2);
    }
}
