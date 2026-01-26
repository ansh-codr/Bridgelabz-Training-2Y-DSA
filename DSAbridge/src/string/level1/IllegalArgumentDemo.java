import java.util.Scanner;

class IllegalArgumentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String s = sc.next();
            System.out.println(s.substring(2, 1));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled.");
        } finally {
            sc.close();
        }
    }
}
