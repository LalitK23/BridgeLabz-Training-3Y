import java.util.Scanner;

public class TrignometryCal {

    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle); // Convert degrees to radians

        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an angle in degrees: ");
        double angle = sc.nextDouble();

        double[] trigValues = calculateTrigonometricFunctions(angle);

        System.out.println("Sine(" + angle + "°) = " + trigValues[0]);
        System.out.println("Cosine(" + angle + "°) = " + trigValues[1]);
        System.out.println("Tangent(" + angle + "°) = " + trigValues[2]);

    }
}
