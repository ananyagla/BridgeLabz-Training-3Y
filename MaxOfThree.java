import java.util.*;

public class MaxOfThree {
    public static int takeInput(Scanner sc) {
        return sc.nextInt();
    }

    public static int findMaximum(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = takeInput(sc);
        int b = takeInput(sc);
        int c = takeInput(sc);
        System.out.println("Maximum is: " + findMaximum(a, b, c));
    }
}
