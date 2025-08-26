import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Error: Enter a natural number");
            return;
        }

        int temp = number, count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        int[] reversed = new int[count];
        for (int i = 0; i < count; i++) {
            reversed[i] = digits[count - 1 - i];
        }

        System.out.print("Original digits: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.print("\nReversed digits: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reversed[i] + " ");
        }

        System.out.print("\nReversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reversed[i]);
        }
    }
}
