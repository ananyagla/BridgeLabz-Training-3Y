import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    
    public static void generateException(String text) {
        System.out.println("Accessing invalid index...");
        System.out.println(text.charAt(text.length())); 
    }


    public static void handleException(String text) {
        try {
            System.out.println("Accessing invalid index safely...");
            System.out.println(text.charAt(text.length())); // Invalid
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("⚠ Caught StringIndexOutOfBoundsException: " + e.getMessage());
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

