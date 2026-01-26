import java.util.Scanner;

class InsertionSortEmployeeIDs {
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
            for (int i = 1; i < n; i++) {
                int k = a[i];
                int j = i - 1;
                while (j >= 0 && a[j] > k) {
                    a[j + 1] = a[j];
                    j--;
                }
                a[j + 1] = k;
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
