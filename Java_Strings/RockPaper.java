import java.util.Scanner;

public class RockPaper {

    static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }

    static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "draw";
        if (user.equals("rock") && comp.equals("scissors")) return "user";
        if (user.equals("scissors") && comp.equals("paper")) return "user";
        if (user.equals("paper") && comp.equals("rock")) return "user";
        return "computer";
    }

    static String[][] calculateStats(int userWins, int compWins, int games) {
        String[][] stats = new String[2][3];
        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", (userWins * 100.0) / games) + "%";
        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.format("%.2f", (compWins * 100.0) / games) + "%";
        return stats;
    }

    static void displayResults(String[][] results, String[][] stats) {
        System.out.println(" Game User Computer Winner");
        System.out.println("-----------------------------------------");
        for (int i = 0; i < results.length; i++) {
            System.out.println((i+1) + " " + results[i][0] + " " + results[i][1] + "  " + results[i][2]);
        }

        System.out.println("Player Stats:");
        System.out.println("Name Wins Winning %");
        System.out.println("----------------------------");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + " " + stats[i][1] + " " + stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        String[][] results = new String[games][3];
        int userWins = 0, compWins = 0;

        for (int i = 0; i < games; i++) {
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String user = sc.next().toLowerCase();
            String comp = getComputerChoice();
            String winner = findWinner(user, comp);

            if (winner.equals("user")) userWins++;
            else if (winner.equals("computer")) compWins++;

            results[i][0] = user;
            results[i][1] = comp;
            results[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, compWins, games);
        displayResults(results, stats);
    }
}
