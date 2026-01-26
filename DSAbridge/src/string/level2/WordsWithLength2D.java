import java.util.Scanner;

class WordsWithLength2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String s = sc.nextLine();
            int n = s.length();
            int wc = 0;
            boolean in = false;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) != ' ' && !in) {
                    wc++;
                    in = true;
                } else if (s.charAt(i) == ' ') {
                    in = false;
                }
            }
            int[] st = new int[wc];
            int[] en = new int[wc];
            int w = 0;
            in = false;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) != ' ' && !in) {
                    st[w] = i;
                    in = true;
                }
                if ((s.charAt(i) == ' ' && in) || (i == n - 1 && in)) {
                    en[w] = (s.charAt(i) == ' ') ? i : i + 1;
                    w++;
                    in = false;
                }
            }
            String[][] a = new String[wc][2];
            for (int i = 0; i < wc; i++) {
                char[] c = new char[en[i] - st[i]];
                for (int j = 0; j < c.length; j++) {
                    c[j] = s.charAt(st[i] + j);
                }
                a[i][0] = new String(c);
                a[i][1] = String.valueOf(c.length);
            }
            System.out.println("Word\tLen");
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i][0] + "\t" + Integer.parseInt(a[i][1]));
            }
        } catch (RuntimeException e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
