import java.util.Scanner;

public class ArrayIndexDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text : ");
        int size = sc.nextInt();
        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the name : ");
            names[i] = sc.next();
        }

        // Part 1: Generate the Exception (unhandled)
        try {
            System.out.println("Generating Exception...");
            System.out.println(names[size]); // accessing invalid index
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }

        // Part 2: Handle the Exception safely
        try {
            System.out.println("Handling Exception...");
            System.out.println(names[size]); // accessing invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }
}
