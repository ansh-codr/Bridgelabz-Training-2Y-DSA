import java.util.InputMismatchException;
import java.util.Scanner;

class FactorsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Invalid number.");
                return;
            }
            int max = 10;
            int[] f = new int[max];
            int idx = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    if (idx == max) {
                        max = max * 2;
                        int[] t = new int[max];
                        for (int j = 0; j < idx; j++) {
                            t[j] = f[j];
                        }
                        f = t;
                    }
                    f[idx] = i;
                    idx++;
                }
            }
            System.out.println("Factors:");
            for (int i = 0; i < idx; i++) {
                System.out.println(f[i]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
