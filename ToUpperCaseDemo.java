import java.util.Scanner;

public class ToUpperCaseDemo {
    // Convert manually
    public static String manualToUpper(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result += (char)(c - 32); 
            } else {
                result += c;
            }
        }
        return result;
    }

    // Compare two strings manually
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String manual = manualToUpper(text);
        String builtIn = text.toUpperCase();

        System.out.println("Manual uppercase: " + manual);
        System.out.println("Built-in uppercase: " + builtIn);

        if (compareStrings(manual, builtIn)) {
            System.out.println("Both uppercase strings match.");
        } else {
            System.out.println("Strings differ.");
        }
    }
}

