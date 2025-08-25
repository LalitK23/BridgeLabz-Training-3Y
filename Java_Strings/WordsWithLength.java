import java.util.Scanner;

public class WordsWithLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text : ");
        String text = sc.nextLine();

        int len = 0;
        try { for (;; len++) text.charAt(len); } catch (Exception e) {}
        int count = 1;
        for (int i = 0; i < len; i++) if (text.charAt(i) == ' ') count++;

        String[] words = new String[count];
        int start = 0, k = 0;
        for (int i = 0; i <= len; i++) {
            if (i == len || text.charAt(i) == ' ') {
                String w = "";
                for (int j = start; j < i; j++) w += text.charAt(j);
                words[k++] = w; start = i + 1;
            }
        }

        String[][] result = new String[count][2];
        for (int i = 0; i < count; i++) {
            int l = 0;
            try {
                for (;; l++) words[i].charAt(l);
            }
            catch (Exception e) {}
            result[i][0] = words[i]; result[i][1] = String.valueOf(l);
        }

        System.out.println("Word Length");
        for (int i = 0; i < count; i++)
            System.out.println(result[i][0] + "\t" + Integer.parseInt(result[i][1]));
    }
}
