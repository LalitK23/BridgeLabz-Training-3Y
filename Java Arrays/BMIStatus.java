import java.util.Scanner;

public class BMIStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3]; // [weight, height, BMI]
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            double weight, height;
            while (true) {
                System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
                weight = sc.nextDouble();
                System.out.print("Enter height (m) of person " + (i + 1) + ": ");
                height = sc.nextDouble();
                if (weight > 0 && height > 0) break;
                System.out.println("Invalid input! Please enter positive values.");
            }

            double bmi = weight / (height * height);

            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = bmi;

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("Person Data :");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) +
                    " -> Weight: " + personData[i][0] + " kg, " +
                    "Height: " + personData[i][1] + " m, " +
                    "BMI: " + String.format("%.2f", personData[i][2]) +
                    ", Status: " + weightStatus[i]);
        }
    }
}
