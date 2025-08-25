public class NullPointerDemo {
    // Method that generates NullPointerException
    public static void generateException() {
        String text = null;
        System.out.println(text.length()); // This will throw NullPointerException
    }

    // Method to handle NullPointerException with try-catch
    public static void handleException() {
        try {
            String text = null;
            System.out.println(text.length()); // risky line
        } catch (NullPointerException e) {
            System.out.println("⚠ Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // First call method that throws exception
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception occurred in generateException()");
        }

        // Now call method that handles it
        handleException();
    }
}

