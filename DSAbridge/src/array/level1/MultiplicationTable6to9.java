import java.util.InputMismatchException;
import java.util.Scanner;

class MultiplicationTable6to9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            int[] a = new int[4];
            for (int i = 0; i < a.length; i++) {
                int m = 6 + i;
                a[i] = n * m;
            }
            for (int i = 0; i < a.length; i++) {
                int m = 6 + i;
                System.out.println(n + " * " + m + " = " + a[i]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
