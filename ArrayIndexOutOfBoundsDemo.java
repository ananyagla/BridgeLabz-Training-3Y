import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {
    public static void generateException(String[] arr) {
        System.out.println(arr[arr.length]); 
    }

    public static void handleException(String[] arr) {
        try {
            System.out.println(arr[arr.length]); // Invalid
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("⚠ Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("⚠ Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        String[] arr = new String[n];

        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        try {
            generateException(arr);
        } catch (Exception e) {
            System.out.println("Exception occurred in generateException()");
        }

        handleException(arr);
    }
}

