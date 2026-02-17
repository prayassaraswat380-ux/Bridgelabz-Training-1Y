import java.util.Scanner;

public class Main {

    public static int[] getAges(int n) {

        Scanner sc = new Scanner(System.in);
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }

        return ages;
    }

    public static String[][] checkVote(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    public static void display(String[][] data) {

        System.out.println("Age\tCan Vote");

        for (int i = 0; i < data.length; i++) {
            boolean canVote = Boolean.parseBoolean(data[i][1]);
            System.out.println(data[i][0] + "\t" + canVote);
        }
    }

    public static void main(String[] args) {

        int n = 10;

        int[] ages = getAges(n);

        String[][] result = checkVote(ages);

        display(result);
    }
}
