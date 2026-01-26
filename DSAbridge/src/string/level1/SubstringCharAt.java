import java.util.Scanner;

class SubstringCharAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String s = sc.next();
            int st = sc.nextInt();
            int en = sc.nextInt();
            if (st < 0 || en > s.length() || st > en) {
                System.out.println("Invalid index.");
                return;
            }
            char[] c = new char[en - st];
            for (int i = 0; i < c.length; i++) {
                c[i] = s.charAt(st + i);
            }
            String a = new String(c);
            String b = s.substring(st, en);
            System.out.println("CharAt substring: " + a);
            System.out.println("Built-in substring: " + b);
            System.out.println("Match: " + a.equals(b));
        } catch (RuntimeException e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
