import java.util.Scanner;

class MonthCalendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int m = sc.nextInt();
            int y = sc.nextInt();
            if (m < 1 || m > 12 || y <= 0) {
                System.out.println("Invalid input.");
                return;
            }
            String[] mn = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
            int[] dm = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
            boolean leap = (y % 400 == 0) || (y % 100 != 0 && y % 4 == 0);
            if (m == 2 && leap) dm[1] = 29;
            int y0 = y - (14 - m) / 12;
            int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
            int m0 = m + 12 * ((14 - m) / 12) - 2;
            int fd = (1 + x + (31 * m0) / 12) % 7;
            System.out.println(mn[m - 1] + " " + y);
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");
            for (int i = 0; i < fd; i++) {
                System.out.print("    ");
            }
            for (int d = 1; d <= dm[m - 1]; d++) {
                System.out.printf("%3d ", d);
                if ((d + fd) % 7 == 0) {
                    System.out.println();
                }
            }
            System.out.println();
        } catch (RuntimeException e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
