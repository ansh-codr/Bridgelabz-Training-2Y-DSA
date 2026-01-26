import java.util.Scanner;

class UniqueCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String s = sc.nextLine();
            char[] t = new char[s.length()];
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
                    t[k] = ch;
                    k++;
                }
            }
            for (int i = 0; i < k; i++) {
                System.out.print(t[i] + " ");
            }
            System.out.println();
        } catch (RuntimeException e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
