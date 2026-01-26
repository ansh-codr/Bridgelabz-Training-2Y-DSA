import java.util.Scanner;

class UppercaseCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String s = sc.nextLine();
            char[] c = new char[s.length()];
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    c[i] = (char) (ch - 32);
                } else {
                    c[i] = ch;
                }
            }
            String a = new String(c);
            String b = s.toUpperCase();
            System.out.println("User upper: " + a);
            System.out.println("Built-in upper: " + b);
            System.out.println("Match: " + a.equals(b));
        } catch (RuntimeException e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
