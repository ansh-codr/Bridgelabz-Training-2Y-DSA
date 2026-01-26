import java.util.InputMismatchException;
import java.util.Scanner;

class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Invalid number.");
                return;
            }
            int t = n;
            int c = 0;
            while (t > 0) {
                c++;
                t = t / 10;
            }
            int[] d = new int[c];
            for (int i = 0; i < c; i++) {
                d[i] = n % 10;
                n = n / 10;
            }
            int[] f = new int[10];
            for (int i = 0; i < d.length; i++) {
                int v = d[i];
                f[v] = f[v] + 1;
            }
            for (int i = 0; i < f.length; i++) {
                System.out.println("Digit " + i + ": " + f[i]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
