import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3]; // physics, chemistry, maths
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));
            int physics, chemistry, maths;
            while (true) {
                System.out.print("Physics: ");
                physics = sc.nextInt();
                System.out.print("Chemistry: ");
                chemistry = sc.nextInt();
                System.out.print("Maths: ");
                maths = sc.nextInt();
                if (physics >= 0 && chemistry >= 0 && maths >= 0) break;
                System.out.println("Invalid input! Enter positive values.");
            }

            marks[i][0] = physics;
            marks[i][1] = chemistry;
            marks[i][2] = maths;

            int total = physics + chemistry + maths;
            percentage[i] = total / 3.0;

            if (percentage[i] >= 80) grade[i] = 'A';
            else if (percentage[i] >= 70) grade[i] = 'B';
            else if (percentage[i] >= 60) grade[i] = 'C';
            else if (percentage[i] >= 50) grade[i] = 'D';
            else if (percentage[i] >= 40) grade[i] = 'E';
            else grade[i] = 'R';
        }

        System.out.println("Student Results :");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) +
                    " -> Physics: " + marks[i][0] +
                    ", Chemistry: " + marks[i][1] +
                    ", Maths: " + marks[i][2] +
                    ", Percentage: " + String.format("%.2f", percentage[i]) + "%" +
                    ", Grade: " + grade[i]);
        }
    }
}
