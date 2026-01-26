import java.util.Scanner;

class CharFrequencyTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String s = sc.nextLine();
            int[] f = new int[256];
            for (int i = 0; i < s.length(); i++) {
                f[s.charAt(i)]++;
            }
            boolean[] seen = new boolean[256];
            System.out.println("Char\tFreq");
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (!seen[ch]) {
                    System.out.println(ch + "\t" + f[ch]);
                    seen[ch] = true;
                }
            }
        } catch (RuntimeException e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
