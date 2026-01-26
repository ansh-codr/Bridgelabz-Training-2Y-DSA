import java.util.Scanner;

class ShortestLongestWord {
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
            if (wc == 0) {
                System.out.println("No words.");
                return;
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
            int[] l = new int[wc];
            for (int i = 0; i < wc; i++) {
                char[] c = new char[en[i] - st[i]];
                for (int j = 0; j < c.length; j++) {
                    c[j] = s.charAt(st[i] + j);
                }
                a[i] = new String(c);
                l[i] = c.length;
            }
            int si = 0, li = 0;
            for (int i = 1; i < wc; i++) {
                if (l[i] < l[si]) si = i;
                if (l[i] > l[li]) li = i;
            }
            System.out.println("Shortest: " + a[si]);
            System.out.println("Longest: " + a[li]);
        } catch (RuntimeException e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
