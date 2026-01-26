import java.util.InputMismatchException;
import java.util.Scanner;

class BMI2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Invalid number.");
                return;
            }
            double[][] p = new double[n][3];
            String[] st = new String[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Enter weight and height for person " + (i + 1) + ":");
                try {
                    double w = sc.nextDouble();
                    double h = sc.nextDouble();
                    if (w <= 0 || h <= 0) {
                        System.out.println("Invalid input. Enter again.");
                        i--;
                        continue;
                    }
                    p[i][0] = w;
                    p[i][1] = h;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Enter again.");
                    sc.next();
                    i--;
                }
            }

            for (int i = 0; i < n; i++) {
                p[i][2] = p[i][0] / (p[i][1] * p[i][1]);
                if (p[i][2] < 18.5) {
                    st[i] = "Underweight";
                } else if (p[i][2] < 25.0) {
                    st[i] = "Normal";
                } else if (p[i][2] < 30.0) {
                    st[i] = "Overweight";
                } else {
                    st[i] = "Obese";
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.println("Height: " + p[i][1] + ", Weight: " + p[i][0] + ", BMI: " + p[i][2] + ", Status: " + st[i]);
            }
        } finally {
            sc.close();
        }
    }
}
