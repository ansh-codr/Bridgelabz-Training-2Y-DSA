import java.util.InputMismatchException;
import java.util.Scanner;

class YoungestTallestFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            final int n = 3;
            double[] a = new double[n];
            double[] h = new double[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Enter age and height for friend " + (i + 1) + ":");
                try {
                    double av = sc.nextDouble();
                    double hv = sc.nextDouble();
                    if (av <= 0 || hv <= 0) {
                        System.out.println("Invalid input. Enter again.");
                        i--;
                        continue;
                    }
                    a[i] = av;
                    h[i] = hv;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Enter again.");
                    sc.next();
                    i--;
                }
            }

            double ya = a[0];
            double th = h[0];
            for (int i = 1; i < n; i++) {
                if (a[i] < ya) {
                    ya = a[i];
                }
                if (h[i] > th) {
                    th = h[i];
                }
            }

            System.out.println("Youngest age: " + ya);
            System.out.println("Tallest height: " + th);
        } finally {
            sc.close();
        }
    }
}
