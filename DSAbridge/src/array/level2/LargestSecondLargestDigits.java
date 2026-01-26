import java.util.InputMismatchException;
import java.util.Scanner;

class LargestSecondLargestDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Invalid number.");
                return;
            }
            int max = 10;
            int[] d = new int[max];
            int idx = 0;
            while (n != 0) {
                if (idx == max) {
                    break;
                }
                d[idx] = n % 10;
                n = n / 10;
                idx++;
            }
            int l = 0;
            int s = 0;
            for (int i = 0; i < idx; i++) {
                if (d[i] > l) {
                    s = l;
                    l = d[i];
                } else if (d[i] > s && d[i] != l) {
                    s = d[i];
                }
            }
            System.out.println("Largest: " + l);
            System.out.println("Second largest: " + s);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
