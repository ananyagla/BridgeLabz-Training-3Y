import java.util.Scanner;

public class DeckOfCards {

    public static String[] initializeDeck() {
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static void shuffle(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + (int) (Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    public static String[][] distribute(String[] deck, int n, int players) {
        if (n % players != 0) return null;
        String[][] result = new String[players][n/players];
        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < n/players; j++) {
                result[i][j] = deck[index++];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of cards to distribute: ");
        int n = sc.nextInt();
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        String[] deck = initializeDeck();
        shuffle(deck);
        String[][] result = distribute(deck, n, players);

        if (result == null) {
            System.out.println("Cards cannot be distributed equally.");
        } else {
            for (int i = 0; i < players; i++) {
                System.out.print("Player " + (i+1) + ": ");
                for (String card : result[i]) {
                    System.out.print(card + ", ");
                }
                System.out.println();
            }
        }
    }
}

