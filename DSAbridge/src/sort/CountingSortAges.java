import java.util.Scanner;

class CountingSortAges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Invalid input.");
                return;
            }
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int mn = 10, mx = 18;
            int[] c = new int[mx - mn + 1];
            for (int i = 0; i < n; i++) {
                c[a[i] - mn]++;
            }
            for (int i = 1; i < c.length; i++) {
                c[i] += c[i - 1];
            }
            int[] o = new int[n];
            for (int i = n - 1; i >= 0; i--) {
                o[c[a[i] - mn] - 1] = a[i];
                c[a[i] - mn]--;
            }
            for (int i = 0; i < n; i++) {
                System.out.print(o[i] + " ");
            }
            System.out.println();
        } catch (RuntimeException e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
