import java.util.Scanner;

public class SplitWordsCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text : ");
        String text = sc.nextLine();

        String[] builtin = text.split(" ");
        int count = 1;
        for (int i = 0;; i++) {
            try { text.charAt(i); }
            catch (Exception e) { break; }
            if (text.charAt(i) == ' ') count++;
        }

        String[] custom = new String[count];
        int start = 0, k = 0;
        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                custom[k++] = text.substring(start, i);
                start = i + 1;
            }
        }

        boolean same = custom.length == builtin.length;
        for (int i = 0; same && i < custom.length; i++)
            if (!custom[i].equals(builtin[i])) same = false;

        System.out.print("Custom: ");
        for (String w : custom) System.out.print(w + " | ");
        System.out.print("Built-in: ");
        for (String w : builtin) System.out.print(w + " | ");
        System.out.println("Comparison: " + same);
    }
}
