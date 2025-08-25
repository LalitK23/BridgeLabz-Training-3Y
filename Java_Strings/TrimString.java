import java.util.Scanner;

public class TrimString {

    static int[] findTrimPoints(String text) {
        int start = 0, end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }

    static String customSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with leading/trailing spaces: ");
        String input = sc.nextLine();

        int[] points = findTrimPoints(input);
        String customTrimmed = customSubstring(input, points[0], points[1]);
        String builtInTrimmed = input.trim();

        System.out.println("Custom Trimmed String: '" + customTrimmed + "'");
        System.out.println("Built-in Trimmed String: '" + builtInTrimmed + "'");
        System.out.println("Both are equal: " + compareStrings(customTrimmed, builtInTrimmed));
    }
}
