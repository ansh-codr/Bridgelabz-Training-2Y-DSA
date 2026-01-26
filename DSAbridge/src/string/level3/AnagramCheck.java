import java.util.Scanner;

class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String a = sc.nextLine();
            String b = sc.nextLine();
            boolean r = true;
            if (a.length() != b.length()) {
                r = false;
            } else {
                int[] f1 = new int[256];
                int[] f2 = new int[256];
                for (int i = 0; i < a.length(); i++) {
                    f1[a.charAt(i)]++;
                    f2[b.charAt(i)]++;
                }
                for (int i = 0; i < 256; i++) {
                    if (f1[i] != f2[i]) {
                        r = false;
                        break;
                    }
                }
            }
            System.out.println("Anagram: " + r);
        } catch (RuntimeException e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
