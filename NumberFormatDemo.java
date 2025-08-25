import java.util.Scanner;

public class NumberFormatDemo {
    public static void generateException(String text) {
        int num = Integer.parseInt(text); // If text is not number → exception
        System.out.println("Converted number: " + num);
    }

    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Converted number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("⚠ Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("⚠ Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        try {
            generateException(text);
        } catch (Exception e) {
            System.out.println("Exception occurred in generateException()");
        }

        handleException(text);
    }
}

