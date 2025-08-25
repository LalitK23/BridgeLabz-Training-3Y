import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text : ");
        String text = sc.next();

        // Part 1: Generate the Exception (unhandled)
        try {
            System.out.println("Generating Exception...");
            System.out.println(text.substring(5, 2));
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }

        // Part 2: Handle the Exception safely
        try {
            System.out.println("Handling Exception...");
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }
}
