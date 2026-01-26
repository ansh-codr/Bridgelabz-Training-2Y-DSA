import java.util.Scanner;

class SelectionSortExamScores {
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
            for (int i = 0; i < n - 1; i++) {
                int mi = i;
                for (int j = i + 1; j < n; j++) {
                    if (a[j] < a[mi]) {
                        mi = j;
                    }
                }
                int t = a[i];
                a[i] = a[mi];
                a[mi] = t;
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
