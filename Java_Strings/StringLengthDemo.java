import java.util.Scanner;

public class StringLengthDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text : ");
        String text = sc.next();

        int customLength = 0;
        try {
            for (;; customLength++) {
                text.charAt(customLength);
            }
        } catch (StringIndexOutOfBoundsException e) {
            // loop ends when exception occurs
        }

        int builtinLength = text.length();

        System.out.println("Custom Length: " + customLength);
        System.out.println("Built-in Length: " + builtinLength);
        System.out.println("Comparison Result: " + (customLength == builtinLength));
    }
}
