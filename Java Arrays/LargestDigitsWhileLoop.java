import java.util.*;
public class LargestDigitsWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("Error: Enter a natural num");
            return;
        }

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (num != 0) {
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                for (int i = 0; i < index; i++) {
                    temp[i] = digits[i];
                }
                digits = temp;
            }
            digits[index++] = num % 10;
            num /= 10;
        }

        int largest = 0, s_l = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                s_l = largest;
                largest = digits[i];
            } else if (digits[i] > s_l && digits[i] != largest) {
                s_l = digits[i];
            }
        }

        System.out.print("Digits: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println("\nLargest digit: " + largest);
        if (s_l == 0 && largest != 0) {
            System.out.println("Second largest digit does not exist");
        } else {
            System.out.println("Second largest digit: " + s_l);
        }
    }
}