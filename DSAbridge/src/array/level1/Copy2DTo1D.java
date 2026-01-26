import java.util.InputMismatchException;
import java.util.Scanner;

class Copy2DTo1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int r = sc.nextInt();
            int c = sc.nextInt();
            if (r <= 0 || c <= 0) {
                System.out.println("Invalid size.");
                return;
            }
            int[][] a = new int[r][c];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            int[] b = new int[r * c];
            int k = 0;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    b[k] = a[i][j];
                    k++;
                }
            }
            System.out.println("Matrix:");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Array:");
            for (int i = 0; i < b.length; i++) {
                System.out.println(b[i]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
