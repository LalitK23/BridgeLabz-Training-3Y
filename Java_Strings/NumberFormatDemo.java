import java.util.Scanner;

public class NumberFormatDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text : ");
        String text = sc.next();

        // Part 1: Generate the Exception (unhandled)
        try {
            System.out.println("Generating Exception...");
            int num = Integer.parseInt(text);
            System.out.println("Converted number: " + num);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }

        // Part 2: Handle the Exception safely
        try {
            System.out.println("Handling Exception...");
            int num = Integer.parseInt(text);
            System.out.println("Converted number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }
}
