import java.util.Scanner;

class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Invalid input.");
                return;
            }
            int uw = 0, cw = 0;
            for (int i = 0; i < n; i++) {
                int u = sc.nextInt();
                if (u < 1 || u > 3) {
                    System.out.println("Invalid input.");
                    return;
                }
                int c = 1 + (int) (Math.random() * 3);
                String un = (u == 1) ? "Rock" : (u == 2) ? "Paper" : "Scissors";
                String cn = (c == 1) ? "Rock" : (c == 2) ? "Paper" : "Scissors";
                System.out.println("Game " + (i + 1) + ": " + un + " vs " + cn);
                if ((u == 1 && c == 3) || (u == 2 && c == 1) || (u == 3 && c == 2)) {
                    uw++;
                } else if (u != c) {
                    cw++;
                }
            }
            double up = (uw * 100.0) / n;
            double cp = (cw * 100.0) / n;
            System.out.println("Player\tWins\tPercent");
            System.out.println("User\t" + uw + "\t" + Math.round(up * 100.0) / 100.0);
            System.out.println("Computer\t" + cw + "\t" + Math.round(cp * 100.0) / 100.0);
        } catch (RuntimeException e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
