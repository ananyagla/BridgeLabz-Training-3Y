import java.util.*;

public class PalinfromeChecker {
    public static boolean isPalindrome(String str) {
        String rev = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println(str + (isPalindrome(str) ? " is Palindrome" : " is Not Palindrome"));
    }
}

