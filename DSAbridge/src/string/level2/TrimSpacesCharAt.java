import java.util.Scanner;

class TrimSpacesCharAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String s = sc.nextLine();
            int n = s.length();
            int st = 0, en = n;
            while (st < n && s.charAt(st) == ' ') st++;
            while (en > st && s.charAt(en - 1) == ' ') en--;
            char[] c = new char[en - st];
            for (int i = 0; i < c.length; i++) {
                c[i] = s.charAt(st + i);
            }
            String a = new String(c);
            String b = s.trim();
            System.out.println("User trim: " + a);
            System.out.println("Built-in trim: " + b);
            System.out.println("Match: " + a.equals(b));
        } catch (RuntimeException e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
