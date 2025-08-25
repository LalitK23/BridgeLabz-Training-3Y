import java.util.Scanner;

public class SubstringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text : ");
        String text = sc.next();
        System.out.print("Enter the starting index : ");
        int start = sc.nextInt();
        System.out.print("Enter the ending index : ");
        int end = sc.nextInt();

        String Sub = "";
        for (int i = start; i < end; i++) {
            Sub += text.charAt(i);
        }

        String builtinSub = text.substring(start, end);

        boolean areEqual = true;
        if (Sub.length() != builtinSub.length()) {
            areEqual = false;
        } else {
            for (int i = 0; i < Sub.length(); i++) {
                if (Sub.charAt(i) != builtinSub.charAt(i)) {
                    areEqual = false;
                    break;
                }
            }
        }

        System.out.println("Custom Substring: " + Sub);
        System.out.println("Comparison Result: " + areEqual);
    }
}
