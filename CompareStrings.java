import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int minLen = Math.min(s1.length(), s2.length());
        int cmp = 0;
        for (int i = 0; i < minLen; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                cmp = s1.charAt(i) - s2.charAt(i);
                break;
            }
        }
        if (cmp == 0) cmp = s1.length() - s2.length();

        if (cmp < 0) System.out.println(s1 + " comes before " + s2);
        else if (cmp > 0) System.out.println(s2 + " comes before " + s1);
        else System.out.println("Both are equal");
    }
}

