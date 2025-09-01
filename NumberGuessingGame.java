import java.util.*;

public class NumberGuessingGame {
    public static int generateGuess(int low, int high) {
        Random rand = new Random();
        return rand.nextInt(high - low + 1) + low;
    }

    public static String getUserFeedback(int guess, Scanner sc) {
        System.out.println("Is your number " + guess + "? (Enter high/low/correct): ");
        return sc.next().toLowerCase();
    }

    public static void playGame() {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        String feedback = "";
        while (!feedback.equals("correct")) {
            int guess = generateGuess(low, high);
            feedback = getUserFeedback(guess, sc);
            if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            }
        }
        System.out.println("Hurray! Computer guessed your number!");
    }

    public static void main(String[] args) {
        playGame();
    }
}

