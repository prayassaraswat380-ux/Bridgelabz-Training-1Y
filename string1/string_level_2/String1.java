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

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        int len1 = findLength(text);
        int len2 = text.length();

        System.out.println(len1);
        System.out.println(len2);

    }
}
