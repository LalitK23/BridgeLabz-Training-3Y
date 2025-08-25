import java.util.Scanner;

public class UniqueChars {

    static int findLength(String text) {
        char[] arr = text.toCharArray();
        int count = 0;
        for (char c : arr) {
            count++;
        }
        return count;
    }

    static char[] findUniqueChars(String text) {
        int len = findLength(text);
        char[] temp = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (ch == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                temp[uniqueCount] = ch;
                uniqueCount++;
            }
        }

        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char[] unique = findUniqueChars(input);

        System.out.print("Unique characters: ");
        for (char c : unique) {
            System.out.print(c + " ");
        }
        sc.close();
    }
}
