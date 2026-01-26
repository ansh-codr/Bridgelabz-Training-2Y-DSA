import java.util.Scanner;

class SplitWordsCompare {
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
            String[] a = new String[wc];
            for (int i = 0; i < wc; i++) {
                char[] c = new char[en[i] - st[i]];
                for (int j = 0; j < c.length; j++) {
                    c[j] = s.charAt(st[i] + j);
                }
                a[i] = new String(c);
            }
            String[] b = s.trim().length() == 0 ? new String[0] : s.trim().split("\\s+");
            boolean r = true;
            if (a.length != b.length) {
                r = false;
            } else {
                for (int i = 0; i < a.length; i++) {
                    if (!a[i].equals(b[i])) {
                        r = false;
                        break;
                    }
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
