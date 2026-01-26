import java.util.Scanner;

class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String s = sc.nextLine();
            boolean r1 = true;
            int i = 0, j = s.length() - 1;
            while (i < j) {
                if (s.charAt(i) != s.charAt(j)) {
                    r1 = false;
                    break;
                }
                i++;
                j--;
            }
            char[] a = s.toCharArray();
            char[] b = new char[s.length()];
            for (int k = 0; k < s.length(); k++) {
                b[k] = s.charAt(s.length() - 1 - k);
            }
            boolean r2 = true;
            for (int k = 0; k < a.length; k++) {
                if (a[k] != b[k]) {
                    r2 = false;
                    break;
                }
            }
            System.out.println("Iterative: " + r1);
            System.out.println("Array: " + r2);
        } catch (RuntimeException e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
