import java.util.Scanner;

public class SubstringCompare {
    // Method to create substring manually using charAt()
    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String manualSub = createSubstring(text, start, end);
        String builtInSub = text.substring(start, end);

        System.out.println("Manual substring: " + manualSub);
        System.out.println("Built-in substring: " + builtInSub);

        if (compareStrings(manualSub, builtInSub)) {
            System.out.println("✅ Both substrings are equal.");
        } else {
            System.out.println("❌ Substrings differ.");
        }
    }
}


