import java.util.InputMismatchException;
import java.util.Scanner;

class AgesVoteCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int[] a = new int[10];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < a.length; i++) {
                if (a[i] < 0) {
                    System.out.println("Invalid age.");
                } else if (a[i] >= 18) {
                    System.out.println("The student with the age " + a[i] + " can vote.");
                } else {
                    System.out.println("The student with the age " + a[i] + " cannot vote.");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
