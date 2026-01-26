import java.util.Scanner;

class FirstNonRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String s = sc.nextLine();
            int[] f = new int[256];
            for (int i = 0; i < s.length(); i++) {
                f[s.charAt(i)]++;
            }
            char r = '\0';
            for (int i = 0; i < s.length(); i++) {
                if (f[s.charAt(i)] == 1) {
                    r = s.charAt(i);
                    break;
                }
            }
            if (r == '\0') {
                System.out.println("No non-repeating character.");
            } else {
                System.out.println("First non-repeating: " + r);
            }
        } catch (RuntimeException e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
