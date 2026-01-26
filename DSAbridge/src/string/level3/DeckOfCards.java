import java.util.Scanner;

class DeckOfCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
            String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
            int n = suits.length * ranks.length;
            String[] deck = new String[n];
            int k = 0;
            for (int i = 0; i < suits.length; i++) {
                for (int j = 0; j < ranks.length; j++) {
                    deck[k] = ranks[j] + " of " + suits[i];
                    k++;
                }
            }
            for (int i = 0; i < n; i++) {
                int r = i + (int) (Math.random() * (n - i));
                String t = deck[i];
                deck[i] = deck[r];
                deck[r] = t;
            }
            int p = sc.nextInt();
            int c = sc.nextInt();
            if (p <= 0 || c <= 0 || p * c > n) {
                System.out.println("Cannot distribute.");
                return;
            }
            k = 0;
            for (int i = 0; i < p; i++) {
                System.out.println("Player " + (i + 1) + ":");
                for (int j = 0; j < c; j++) {
                    System.out.println(deck[k]);
                    k++;
                }
            }
        } catch (RuntimeException e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
