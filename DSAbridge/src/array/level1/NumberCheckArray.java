import java.util.InputMismatchException;
import java.util.Scanner;

class NumberCheckArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int[] a = new int[5];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < a.length; i++) {
                if (a[i] > 0) {
                    if (a[i] % 2 == 0) {
                        System.out.println(a[i] + " is positive even.");
                    } else {
                        System.out.println(a[i] + " is positive odd.");
                    }
                } else if (a[i] < 0) {
                    System.out.println(a[i] + " is negative.");
                } else {
                    System.out.println(a[i] + " is zero.");
                }
            }
            int f = a[0];
            int l = a[a.length - 1];
            if (f == l) {
                System.out.println("First and last are equal.");
            } else if (f > l) {
                System.out.println("First is greater than last.");
            } else {
                System.out.println("First is less than last.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
