import java.util.Scanner;

public class CharFrequency {

    static String[][] findCharFrequency(String text) {
        int[] freq = new int[256];
        int len = text.toCharArray().length;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        String[][] result = new String[len][2];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (freq[ch] != 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                freq[ch] = 0;
                index++;
            }
        }

        String[][] finalResult = new String[index][2];
        for (int i = 0; i < index; i++) {
            finalResult[i][0] = result[i][0];
            finalResult[i][1] = result[i][1];
        }
        return finalResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] frequency = findCharFrequency(input);

        System.out.println("Character  Frequency");
        for(int i = 0; i < frequency.length; i++) {
            System.out.println(frequency[i][0] + "          " + frequency[i][1]);
        }
    }
}
