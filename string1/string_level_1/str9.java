import java.util.Scanner;

public class Main {

    public static String toUpperManual(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }

            result = result + ch;
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

        String upper1 = toUpperManual(text);
        String upper2 = text.toUpperCase();

        boolean result = check(upper1, upper2);

        System.out.println(upper1);
        System.out.println(upper2);
        System.out.println(result);

        
    }
}
