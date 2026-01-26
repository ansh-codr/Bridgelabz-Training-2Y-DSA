import java.util.InputMismatchException;
import java.util.Scanner;

class BMIArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Invalid number.");
                return;
            }
            double[] w = new double[n];
            double[] h = new double[n];
            double[] b = new double[n];
            String[] st = new String[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Enter weight and height for person " + (i + 1) + ":");
                try {
                    double wv = sc.nextDouble();
                    double hv = sc.nextDouble();
                    if (wv <= 0 || hv <= 0) {
                        System.out.println("Invalid input. Enter again.");
                        i--;
                        continue;
                    }
                    w[i] = wv;
                    h[i] = hv;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Enter again.");
                    sc.next();
                    i--;
                }
            }

            for (int i = 0; i < n; i++) {
                b[i] = w[i] / (h[i] * h[i]);
                if (b[i] < 18.5) {
                    st[i] = "Underweight";
                } else if (b[i] < 25.0) {
                    st[i] = "Normal";
                } else if (b[i] < 30.0) {
                    st[i] = "Overweight";
                } else {
                    st[i] = "Obese";
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.println("Height: " + h[i] + ", Weight: " + w[i] + ", BMI: " + b[i] + ", Status: " + st[i]);
            }
        } finally {
            sc.close();
        }
    }
}
