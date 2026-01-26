import java.util.Scanner;

class CompareStringsCharAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String a = sc.next();
            String b = sc.next();
            boolean r = true;
            if (a.length() != b.length()) {
                r = false;
            } else {
                for (int i = 0; i < a.length(); i++) {
                    if (a.charAt(i) != b.charAt(i)) {
                        r = false;
                        break;
                    }
                }
            }
            System.out.println("CharAt compare: " + r);
            System.out.println("Equals compare: " + a.equals(b));
        } catch (RuntimeException e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
