import java.util.Scanner;

class CharFrequencyUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String s = sc.nextLine();
            int[] f = new int[256];
            for (int i = 0; i < s.length(); i++) {
                f[s.charAt(i)]++;
            }
            char[] u = new char[s.length()];
            int k = 0;
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                boolean seen = false;
                for (int j = 0; j < i; j++) {
                    if (s.charAt(j) == ch) {
                        seen = true;
                        break;
                    }
                }
                if (!seen) {
                    u[k] = ch;
                    k++;
                }
            }
            System.out.println("Char\tFreq");
            for (int i = 0; i < k; i++) {
                System.out.println(u[i] + "\t" + f[u[i]]);
            }
        } catch (RuntimeException e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
