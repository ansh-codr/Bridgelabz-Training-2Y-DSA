import java.util.InputMismatchException;
import java.util.Scanner;

class ReverseNumberUsingArray {
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
            int[] r = new int[c];
            for (int i = 0; i < c; i++) {
                r[i] = d[c - 1 - i];
            }
            System.out.println("Reversed digits:");
            for (int i = 0; i < r.length; i++) {
                System.out.print(r[i]);
            }
            System.out.println();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
