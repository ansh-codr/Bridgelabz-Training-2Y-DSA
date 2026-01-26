import java.util.Scanner;

class StudentGradesTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Invalid input.");
                return;
            }
            int[][] m = new int[n][3];
            for (int i = 0; i < n; i++) {
                m[i][0] = 10 + (int) (Math.random() * 90);
                m[i][1] = 10 + (int) (Math.random() * 90);
                m[i][2] = 10 + (int) (Math.random() * 90);
            }
            System.out.println("P\tC\tM\tTotal\tAvg\tPercent\tGrade");
            for (int i = 0; i < n; i++) {
                double t = m[i][0] + m[i][1] + m[i][2];
                double avg = Math.round((t / 3.0) * 100.0) / 100.0;
                double per = avg;
                String g;
                if (per >= 80) g = "A";
                else if (per >= 70) g = "B";
                else if (per >= 60) g = "C";
                else if (per >= 50) g = "D";
                else if (per >= 40) g = "E";
                else g = "R";
                System.out.println(m[i][0] + "\t" + m[i][1] + "\t" + m[i][2] + "\t" + (int) t + "\t" + avg + "\t" + per + "\t" + g);
            }
        } catch (RuntimeException e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
