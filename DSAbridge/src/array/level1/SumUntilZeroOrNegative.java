import java.util.InputMismatchException;
import java.util.Scanner;

class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            double[] a = new double[10];
            int i = 0;
            while (true) {
                if (i == a.length) {
                    break;
                }
                double v = sc.nextDouble();
                if (v <= 0) {
                    break;
                }
                a[i] = v;
                i++;
            }
            double s = 0.0;
            System.out.println("Numbers:");
            for (int j = 0; j < i; j++) {
                System.out.println(a[j]);
                s += a[j];
            }
            System.out.println("Sum: " + s);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
