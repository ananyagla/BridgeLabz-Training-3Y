import java.util.Scanner;

public class ToCharArrayCompare {
    // User-defined method to return characters
    public static char[] manualToCharArray(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }

    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] manualArray = manualToCharArray(text);
        char[] builtInArray = text.toCharArray();

        System.out.println("Manual array: " + new String(manualArray));
        System.out.println("Built-in array: " + new String(builtInArray));

        if (compareCharArrays(manualArray, builtInArray)) {
            System.out.println("Both arrays are equal.");
        } else {
            System.out.println("Arrays differ.");
        }
    }
}


