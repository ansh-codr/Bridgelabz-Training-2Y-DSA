import java.util.Scanner;

class VowelConsonantTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String s = sc.nextLine();
            System.out.println("Char\tType");
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                char lc = ch;
                if (lc >= 'A' && lc <= 'Z') lc = (char) (lc + 32);
                String t;
                if (lc >= 'a' && lc <= 'z') {
                    if (lc == 'a' || lc == 'e' || lc == 'i' || lc == 'o' || lc == 'u') {
                        t = "Vowel";
                    } else {
                        t = "Consonant";
                    }
                } else {
                    t = "Not a Letter";
                }
                System.out.println(ch + "\t" + t);
            }
        } catch (RuntimeException e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
