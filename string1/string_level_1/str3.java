import java.util.Scanner;

public class Main {

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

        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String sub1 = makeSub(text, start, end);
        String sub2 = text.substring(start, end);

        boolean result = check(sub1, sub2);

        System.out.println(sub1);
        System.out.println(sub2);
        System.out.println(result);

        
    }
}
