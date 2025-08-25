import java.util.Scanner;

public class LowerCaseCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text : ");
        String text = sc.nextLine();

        String customLower = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                customLower += (char)(ch + 32);
            } else {
                customLower += ch;
            }
        }

        String builtinLower = text.toLowerCase();

        boolean areEqual = true;
        if (customLower.length() != builtinLower.length()) {
            areEqual = false;
        } else {
            for (int i = 0; i < customLower.length(); i++) {
                if (customLower.charAt(i) != builtinLower.charAt(i)) {
                    areEqual = false;
                    break;
                }
            }
        }

        System.out.println("Custom Lowercase: " + customLower);
        System.out.println("Built-in Lowercase: " + builtinLower);
        System.out.println("Comparison Result: " + areEqual);
    }
}
