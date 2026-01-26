import java.util.InputMismatchException;
import java.util.Scanner;

class MeanHeightFootball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            double[] a = new double[11];
            double s = 0.0;
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextDouble();
                s += a[i];
            }
            double m = s / a.length;
            System.out.println("Mean height: " + m);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
