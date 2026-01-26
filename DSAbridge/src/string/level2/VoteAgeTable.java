import java.util.Scanner;

class VoteAgeTable {
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
                a[i] = 10 + (int) (Math.random() * 90);
            }
            System.out.println("Age\tCanVote");
            for (int i = 0; i < n; i++) {
                String v = (a[i] >= 18) ? "true" : "false";
                System.out.println(a[i] + "\t" + v);
            }
        } catch (RuntimeException e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
