import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string : ");
        String str1 = sc.next();
        System.out.print("Enter the second string : ");
        String str2 = sc.next();
        boolean result1 = true;
        if (str1.length() != str2.length()) {
            result1 = false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    result1 = false;
                    break;
                }
            }
        }
        boolean result2 = str1.equals(str2);
        System.out.println("Custom Compare Result: " + result1);
        System.out.println("String equals() Result: " + result2);
        System.out.println("Results are same: " + (result1 == result2));
    }
}
