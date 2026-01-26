import java.util.Scanner;

class NumberFormatDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String s = sc.next();
            System.out.println(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled.");
        } finally {
            sc.close();
        }
    }
}
