import java.util.Scanner;

public class QuotientandRemainder{
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[]{number % divisor, number / divisor};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number and divisor: ");
        int number = sc.nextInt(), divisor = sc.nextInt();
        int[] result = findRemainderAndQuotient(number, divisor);
        System.out.println("Quotient = " + result[1] + ", Remainder = " + result[0]);
        sc.close();
    }
}

