import java.util.Scanner;

public class RemoveChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char remove = sc.next().charAt(0);

        String result = str.replaceAll(String.valueOf(remove), "");
        System.out.println("Modified String: " + result);
    }
}

