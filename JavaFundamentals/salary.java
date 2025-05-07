import java.util.Scanner;

public class salary{
    public static double bonus(double salary, double point) {
        return point * salary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your sex(m/f): ");
        char sex = scanner.next().charAt(0);
        sex = Character.toLowerCase(sex);

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();
        double bn;

        if (sex == 'f') {
            bn = bonus(salary, 0.1);
        } else {
            bn = bonus(salary, 0.05);
        }

        if (salary < 10000.00) {
            bn = bn + bonus(salary, 0.02);
        }

        System.out.println("Salary = " + salary);
        System.out.println("Bonus = " + bn);
        System.out.println("Amount to be paid = " + (salary + bn));
    }
}
