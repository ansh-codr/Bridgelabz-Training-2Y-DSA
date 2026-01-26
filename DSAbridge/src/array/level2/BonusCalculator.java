import java.util.InputMismatchException;
import java.util.Scanner;

class BonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            final int n = 10;
            double[] s = new double[n];
            double[] y = new double[n];
            double[] b = new double[n];
            double[] ns = new double[n];
            double tb = 0.0;
            double ts = 0.0;
            double tn = 0.0;

            for (int i = 0; i < n; i++) {
                System.out.println("Enter salary and years for employee " + (i + 1) + ":");
                try {
                    double sv = sc.nextDouble();
                    double yv = sc.nextDouble();
                    if (sv < 0 || yv < 0) {
                        System.out.println("Invalid input. Enter again.");
                        i--;
                        continue;
                    }
                    s[i] = sv;
                    y[i] = yv;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Enter again.");
                    sc.next();
                    i--;
                }
            }

            for (int i = 0; i < n; i++) {
                double r = (y[i] > 5) ? 0.05 : 0.02;
                b[i] = s[i] * r;
                ns[i] = s[i] + b[i];
                tb += b[i];
                ts += s[i];
                tn += ns[i];
            }

            System.out.println("Total bonus: " + tb);
            System.out.println("Total old salary: " + ts);
            System.out.println("Total new salary: " + tn);
        } finally {
            sc.close();
        }
    }
}
