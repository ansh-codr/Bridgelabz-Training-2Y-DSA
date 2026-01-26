import java.util.InputMismatchException;
import java.util.Scanner;

class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Invalid number.");
                return;
            }
            int[] o = new int[n / 2 + 1];
            int[] e = new int[n / 2 + 1];
            int oi = 0;
            int ei = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    e[ei] = i;
                    ei++;
                } else {
                    o[oi] = i;
                    oi++;
                }
            }
            System.out.println("Odd:");
            for (int i = 0; i < oi; i++) {
                System.out.println(o[i]);
            }
            System.out.println("Even:");
            for (int i = 0; i < ei; i++) {
                System.out.println(e[i]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
