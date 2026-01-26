import java.util.Scanner;

class HeapSortSalary {
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
            for (int i = n / 2 - 1; i >= 0; i--) {
                int k = i;
                while (true) {
                    int l = 2 * k + 1;
                    int r = 2 * k + 2;
                    int mx = k;
                    if (l < n && a[l] > a[mx]) mx = l;
                    if (r < n && a[r] > a[mx]) mx = r;
                    if (mx == k) break;
                    int t = a[k];
                    a[k] = a[mx];
                    a[mx] = t;
                    k = mx;
                }
            }
            for (int i = n - 1; i > 0; i--) {
                int t = a[0];
                a[0] = a[i];
                a[i] = t;
                int k = 0;
                while (true) {
                    int l = 2 * k + 1;
                    int r = 2 * k + 2;
                    int mx = k;
                    if (l < i && a[l] > a[mx]) mx = l;
                    if (r < i && a[r] > a[mx]) mx = r;
                    if (mx == k) break;
                    t = a[k];
                    a[k] = a[mx];
                    a[mx] = t;
                    k = mx;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        } catch (RuntimeException e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
