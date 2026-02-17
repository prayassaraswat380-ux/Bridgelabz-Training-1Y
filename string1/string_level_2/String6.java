import java.util.Scanner;

public class Main {

    public static String checkChar(char ch) {

        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }

        } else {
            return "Not a Letter";
        }
    }

    public static String[][] analyze(String s) {

        String[][] table = new String[s.length()][2];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            table[i][0] = String.valueOf(ch);
            table[i][1] = checkChar(ch);
        }

        return table;
    }

    public static void display(String[][] table) {

        System.out.println("Character\tType");

        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t\t" + table[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[][] result = analyze(text);

        display(result);

    }
}
