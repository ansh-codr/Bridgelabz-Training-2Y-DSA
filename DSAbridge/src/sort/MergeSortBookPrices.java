import java.util.Scanner;

class MergeSortBookPrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Invalid input.");
                return;
            }
            double[] a = new double[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextDouble();
            }
            double[] t = new double[n];
            int w = 1;
            while (w < n) {
                for (int i = 0; i < n; i += 2 * w) {
                    int l = i;
                    int m = Math.min(i + w, n);
                    int r = Math.min(i + 2 * w, n);
                    int p = l, q = m, k = l;
                    while (p < m && q < r) {
                        if (a[p] <= a[q]) {
                            t[k++] = a[p++];
                        } else {
                            t[k++] = a[q++];
                        }
                    }
                    while (p < m) t[k++] = a[p++];
                    while (q < r) t[k++] = a[q++];
                }
                for (int i = 0; i < n; i++) {
                    a[i] = t[i];
                }
                w *= 2;
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
