import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Compare characters from start and end
    static boolean isPalindrome1(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method
    static boolean isPalindrome2(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindrome2(text, start + 1, end - 1);
    }

    // Logic 3: Reverse string using charAt() and compare with original
    static boolean isPalindrome3(String text) {
        int len = text.length();
        char[] reverse = new char[len];
        for (int i = 0; i < len; i++) {
            reverse[i] = text.charAt(len - 1 - i);
        }
        char[] original = text.toCharArray();

        for (int i = 0; i < len; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        System.out.println("Logic 1 (Two-pointer check): " + (isPalindrome1(input) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 2 (Recursive check): " + (isPalindrome2(input, 0, input.length() - 1) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 3 (Reverse array check): " + (isPalindrome3(input) ? "Palindrome" : "Not Palindrome"));
    }
}
