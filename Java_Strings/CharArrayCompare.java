import java.util.Scanner;

public class CharArrayCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text : ");
        String text = sc.next();

        char[] customArray = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            customArray[i] = text.charAt(i);
        }

        char[] builtinArray = text.toCharArray();

        boolean areEqual = true;
        if (customArray.length != builtinArray.length) {
            areEqual = false;
        } else {
            for (int i = 0; i < customArray.length; i++) {
                if (customArray[i] != builtinArray[i]) {
                    areEqual = false;
                    break;
                }
            }
        }

        System.out.print("Custom Array: ");
        for (char c : customArray) {
            System.out.print(c + " ");
        }

        System.out.println("Comparison Result: " + areEqual);
    }
}
