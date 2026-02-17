import java.util.Scanner;

public class Main {

    public static int[] findTrimIndexes(String s) {

        int start = 0;
        int end = s.length() - 1;

        while (start < s.length() && s.charAt(start) == ' ') {
            start++;
        }

        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end + 1};
    }

    public static String makeSub(String s, int start, int end) {

        String result = "";

        for (int i = start; i < end; i++) {
            result = result + s.charAt(i);
        }

        return result;
    }

    public static boolean check(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        int[] indexes = findTrimIndexes(text);
        String trimmed1 = makeSub(text, indexes[0], indexes[1]);

        String trimmed2 = text.trim();

        boolean result = check(trimmed1, trimmed2);

        System.out.println("Manual Trim: " + trimmed1);
        System.out.println("Built-in Trim: " + trimmed2);
        System.out.println("Same Result: " + result);

        
    }
}
