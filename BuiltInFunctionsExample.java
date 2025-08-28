import java.util.Arrays;
import java.util.Random;

public class BuiltInFunctionsExample {

    public static void generateRandomNumbers() {
        Random random = new Random();
        System.out.println("Random number (0-99): " + random.nextInt(100));

        double randomDouble = Math.random() * 100;
        System.out.println("Random double (0-100): " + (int) randomDouble);
    }

    public static void performMathOperations() {
        int num = -25;
        System.out.println("Absolute value of " + num + ": " + Math.abs(num));
        System.out.println("Square root of 25: " + Math.sqrt(25));
        System.out.println("2 raised to the power of 3: " + Math.pow(2, 3));
    }

    public static void manipulateArray() {
        int[] numbers = {5, 3, 8, 1, 2};
        System.out.println("Original Array: " + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        int index = Arrays.binarySearch(numbers, 3);
        System.out.println("Index of 3 after sorting: " + index);
    }

    public static void manipulateString() {
        String text = "hello World!";
        System.out.println("Original String: " + text);
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Substring (0-5): " + text.substring(0, 5));
    }

    public static void main(String[] args) {
        System.out.println("Random Numbers:");
        generateRandomNumbers();

        System.out.println("\nMath Operations:");
        performMathOperations();

        System.out.println("\nArray Manipulation:");
        manipulateArray();

        System.out.println("\nString Manipulation:");
        manipulateString();
    }
}
