import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = sc.nextLong();   // long to handle big numbers
        if (number < 0) {
            System.out.println("Error: Enter a positive number");
            return;
        }

        // Convert number to string to get count of digits
        String numStr = Long.toString(number);
        int count = numStr.length();

        int[] digits = new int[count];
        int[] frequency = new int[10]; // frequency of digits 0–9

        // Store digits into array
        for (int i = 0; i < count; i++) {
            digits[i] = numStr.charAt(i) - '0';
        }

        // Count frequency
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // Display frequency
        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " -> " + frequency[i] + " times");
            }
        }
    }
}
