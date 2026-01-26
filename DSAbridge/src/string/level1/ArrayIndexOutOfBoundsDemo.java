import java.util.Scanner;

class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            String[] a = new String[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.next();
            }
            System.out.println(a[a.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled.");
        } catch (RuntimeException e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
