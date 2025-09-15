import java.util.Scanner;
public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        double a = sc.nextDouble();
        System.out.print("Enter the second number : ");
        double b = sc.nextDouble();
        System.out.print("Enter the third number : ");
        double c = sc.nextDouble();
        double f = a + b * c;
        double s = a * b + c;
        double t = c + a / b;
        double fourth = a % b + c;
        System.out.print("The result of IntOperation are " + f + "," + s + "," + t + " and " + fourth);
    }
}
