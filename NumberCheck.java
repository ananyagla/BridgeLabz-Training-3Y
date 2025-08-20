import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int num : arr) {
            if (num > 0) {
                if (num % 2 == 0)
                    System.out.println(num + " is Positive Even");
                else
                    System.out.println(num + " is Positive Odd");
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println(num + " is Zero");
            }
        }

        // Compare first and last
        if (arr[0] == arr[4])
            System.out.println("First and last elements are equal.");
        else if (arr[0] > arr[4])
            System.out.println("First element is greater than last.");
        else
            System.out.println("First element is less than last.");
    }
}

