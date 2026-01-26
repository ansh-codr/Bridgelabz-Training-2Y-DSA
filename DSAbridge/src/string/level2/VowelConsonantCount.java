import java.util.Scanner;

class VowelConsonantCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String s = sc.nextLine();
            int v = 0, c = 0;
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch >= 'A' && ch <= 'Z') ch = (char) (ch + 32);
                if (ch >= 'a' && ch <= 'z') {
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        v++;
                    } else {
                        c++;
                    }
                }
            }
            System.out.println("Vowels: " + v);
            System.out.println("Consonants: " + c);
        } catch (RuntimeException e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
