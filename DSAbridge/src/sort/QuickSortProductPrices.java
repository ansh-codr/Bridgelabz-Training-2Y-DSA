import java.util.Scanner;

class QuickSortProductPrices {
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
            int[] st = new int[n];
            int[] en = new int[n];
            int top = 0;
            st[top] = 0;
            en[top] = n - 1;
            top++;
            while (top > 0) {
                top--;
                int l = st[top];
                int h = en[top];
                if (l >= h) continue;
                double p = a[h];
                int i = l - 1;
                for (int j = l; j < h; j++) {
                    if (a[j] < p) {
                        i++;
                        double t = a[i];
                        a[i] = a[j];
                        a[j] = t;
                    }
                }
                double t = a[i + 1];
                a[i + 1] = a[h];
                a[h] = t;
                int pi = i + 1;
                st[top] = l;
                en[top] = pi - 1;
                top++;
                st[top] = pi + 1;
                en[top] = h;
                top++;
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
