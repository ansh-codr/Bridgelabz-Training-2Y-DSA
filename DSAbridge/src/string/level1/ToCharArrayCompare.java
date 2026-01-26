import java.util.Scanner;

class ToCharArrayCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String s = sc.next();
            char[] a = new char[s.length()];
            for (int i = 0; i < s.length(); i++) {
                a[i] = s.charAt(i);
            }
            char[] b = s.toCharArray();
            boolean r = true;
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    r = false;
                    break;
                }
            }
            System.out.println("Match: " + r);
        } catch (RuntimeException e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
