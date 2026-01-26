import java.util.Scanner;

class LowercaseCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String s = sc.nextLine();
            char[] c = new char[s.length()];
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch >= 'A' && ch <= 'Z') {
                    c[i] = (char) (ch + 32);
                } else {
                    c[i] = ch;
                }
            }
            String a = new String(c);
            String b = s.toLowerCase();
            System.out.println("User lower: " + a);
            System.out.println("Built-in lower: " + b);
            System.out.println("Match: " + a.equals(b));
        } catch (RuntimeException e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
