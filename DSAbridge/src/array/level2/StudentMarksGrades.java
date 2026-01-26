import java.util.InputMismatchException;
import java.util.Scanner;

class StudentMarksGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Invalid number.");
                return;
            }
            double[] p = new double[n];
            double[] c = new double[n];
            double[] m = new double[n];
            double[] per = new double[n];
            String[] g = new String[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Enter physics, chemistry, maths for student " + (i + 1) + ":");
                try {
                    double pv = sc.nextDouble();
                    double cv = sc.nextDouble();
                    double mv = sc.nextDouble();
                    if (pv < 0 || cv < 0 || mv < 0) {
                        System.out.println("Invalid input. Enter again.");
                        i--;
                        continue;
                    }
                    p[i] = pv;
                    c[i] = cv;
                    m[i] = mv;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Enter again.");
                    sc.next();
                    i--;
                }
            }

            for (int i = 0; i < n; i++) {
                per[i] = (p[i] + c[i] + m[i]) / 3.0;
                if (per[i] >= 90) {
                    g[i] = "A";
                } else if (per[i] >= 80) {
                    g[i] = "B";
                } else if (per[i] >= 70) {
                    g[i] = "C";
                } else if (per[i] >= 60) {
                    g[i] = "D";
                } else {
                    g[i] = "F";
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.println("Physics: " + p[i] + ", Chemistry: " + c[i] + ", Maths: " + m[i] + ", Percent: " + per[i] + ", Grade: " + g[i]);
            }
        } finally {
            sc.close();
        }
    }
}
