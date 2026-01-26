import java.util.Scanner;

class StringLengthNoLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String s = sc.next();
            int c = 0;
            try {
                while (true) {
                    s.charAt(c);
                    c++;
                }
            } catch (RuntimeException e) {
            }
            System.out.println("User length: " + c);
            System.out.println("Built-in length: " + s.length());
        } finally {
            sc.close();
        }
    }
}
