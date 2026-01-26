import java.util.InputMismatchException;
import java.util.Scanner;

class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Invalid number.");
                return;
            }
            String[] a = new String[n + 1];
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    a[i] = "FizzBuzz";
                } else if (i % 3 == 0) {
                    a[i] = "Fizz";
                } else if (i % 5 == 0) {
                    a[i] = "Buzz";
                } else {
                    a[i] = String.valueOf(i);
                }
            }
            for (int i = 1; i <= n; i++) {
                System.out.println("Position " + i + " = " + a[i]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
