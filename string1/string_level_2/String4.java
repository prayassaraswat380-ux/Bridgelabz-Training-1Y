import java.util.Scanner;

public class Main {

    public static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }

    public static String[] splitManual(String s) {

        int len = findLength(s);
        int words = 1;

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') {
                words++;
            }
        }

        int[] spaceIndex = new int[words - 1];
        int k = 0;

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') {
                spaceIndex[k++] = i;
            }
        }

        String[] result = new String[words];
        int start = 0;

        for (int i = 0; i < words; i++) {

            int end;
            if (i < words - 1) {
                end = spaceIndex[i];
            } else {
                end = len;
            }

            String word = "";
            for (int j = start; j < end; j++) {
                word = word + s.charAt(j);
            }

            result[i] = word;
            start = end + 1;
        }

        return result;
    }

    public static String[][] make2D(String[] words) {

        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int len = findLength(words[i]);
            table[i][0] = words[i];
            table[i][1] = String.valueOf(len);
        }

        return table;
    }

    public static int[] findMinMax(String[][] table) {

        int minIndex = 0;
        int maxIndex = 0;

        int min = Integer.parseInt(table[0][1]);
        int max = Integer.parseInt(table[0][1]);

        for (int i = 1; i < table.length; i++) {

            int value = Integer.parseInt(table[i][1]);

            if (value < min) {
                min = value;
                minIndex = i;
            }

            if (value > max) {
                max = value;
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] words = splitManual(text);
        String[][] table = make2D(words);
        int[] result = findMinMax(table);

        System.out.println("Shortest word: " + table[result[0]][0]);
        System.out.println("Longest word: " + table[result[1]][0]);

    }
}
