import java.util.Scanner;

public class Main {

    public static String computerChoice() {
        int num = (int) (Math.random() * 3);

        if (num == 0) {
            return "rock";
        } else if (num == 1) {
            return "paper";
        } else {
            return "scissors";
        }
    }

    public static String findWinner(String user, String comp) {

        if (user.equals(comp)) {
            return "Draw";
        }

        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    public static String[][] calculateStats(int userWins, int compWins, int totalGames) {

        String[][] stats = new String[2][3];

        double userPercent = (userWins * 100.0) / totalGames;
        double compPercent = (compWins * 100.0) / totalGames;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.valueOf(userPercent);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.valueOf(compPercent);

        return stats;
    }

    public static void display(String[][] games, String[][] stats) {

        System.out.println("Game\tUser\tComputer\tWinner");

        for (int i = 0; i < games.length; i++) {
            System.out.println((i + 1) + "\t" + games[i][0] + "\t" + games[i][1] + "\t\t" + games[i][2]);
        }

        System.out.println("\nPlayer\tWins\tWin %");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[][] games = new String[n][3];

        int userWins = 0;
        int compWins = 0;

        for (int i = 0; i < n; i++) {

            String user = sc.nextLine().toLowerCase();
            String comp = computerChoice();

            String winner = findWinner(user, comp);

            if (winner.equals("User")) {
                userWins++;
            } else if (winner.equals("Computer")) {
                compWins++;
            }

            games[i][0] = user;
            games[i][1] = comp;
            games[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, compWins, n);

        display(games, stats);

        
    }
}
