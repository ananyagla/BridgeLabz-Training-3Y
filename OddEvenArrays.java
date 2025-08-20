import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Not a natural number!");
            return;
        }

        int[] even = new int[number / 2 + 1];
        int[] odd = new int[number / 2 + 1];
        int eIndex = 0, oIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0)
                even[eIndex++] = i;
            else
                odd[oIndex++] = i;
        }

        System.out.println("Even Numbers:");
        for (int i = 0; i < eIndex; i++) System.out.print(even[i] + " ");

        System.out.println("\nOdd Numbers:");
        for (int i = 0; i < oIndex; i++) System.out.print(odd[i] + " ");
    }
}

