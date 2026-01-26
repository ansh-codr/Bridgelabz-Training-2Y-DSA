import java.util.InputMismatchException;
import java.util.Scanner;

class MultiplicationTableArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            int[] a = new int[10];
            for (int i = 0; i < a.length; i++) {
                a[i] = n * (i + 1);
            }
            for (int i = 0; i < a.length; i++) {
                System.out.println(n + " * " + (i + 1) + " = " + a[i]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
