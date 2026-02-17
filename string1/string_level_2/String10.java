import java.util.Scanner;

public class Main {

    public static int[][] generateMarks(int n) {

        int[][] marks = new int[n][3];

        for (int i = 0; i < n; i++) {
            marks[i][0] = 10 + (int)(Math.random() * 90); // Physics
            marks[i][1] = 10 + (int)(Math.random() * 90); // Chemistry
            marks[i][2] = 10 + (int)(Math.random() * 90); // Maths
        }

        return marks;
    }

    public static double[][] calculateResults(int[][] marks) {

        int n = marks.length;
        double[][] result = new double[n][3]; // total, average, percentage

        for (int i = 0; i < n; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }

        return result;
    }

    public static String[] calculateGrade(double[][] result) {

        int n = result.length;
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {

            double p = result[i][2];

            if (p >= 80) {
                grades[i] = "A";
            } else if (p >= 70) {
                grades[i] = "B";
            } else if (p >= 60) {
                grades[i] = "C";
            } else if (p >= 50) {
                grades[i] = "D";
            } else if (p >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        return grades;
    }

    public static void display(int[][] marks, double[][] result, String[] grades) {

        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        for (int i = 0; i < marks.length; i++) {

            System.out.println(
                    (i + 1) + "\t" +
                    marks[i][0] + "\t" +
                    marks[i][1] + "\t" +
                    marks[i][2] + "\t" +
                    (int)result[i][0] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2] + "\t" +
                    grades[i]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] marks = generateMarks(n);
        double[][] result = calculateResults(marks);
        String[] grades = calculateGrade(result);

        display(marks, result, grades);

       
    }
}
