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

    public static boolean compare(String[] a, String[] b) {

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] arr1 = splitManual(text);
        String[] arr2 = text.split(" ");

        boolean result = compare(arr1, arr2);

        System.out.println(result);

    }
}
