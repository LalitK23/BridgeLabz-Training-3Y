import java.util.Scanner;

public class UpperCaseCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text : ");
        String text = sc.nextLine();

        String customUpper = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                customUpper += (char)(ch - 32);
            } else {
                customUpper += ch;
            }
        }

        String builtinUpper = text.toUpperCase();

        boolean areEqual = true;
        if (customUpper.length() != builtinUpper.length()) {
            areEqual = false;
        } else {
            for (int i = 0; i < customUpper.length(); i++) {
                if (customUpper.charAt(i) != builtinUpper.charAt(i)) {
                    areEqual = false;
                    break;
                }
            }
        }

        System.out.println("Custom Uppercase: " + customUpper);
        System.out.println("Built-in Uppercase: " + builtinUpper);
        System.out.println("Comparison Result: " + areEqual);
    }
}
