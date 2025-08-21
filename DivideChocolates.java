import java.util.Scanner;

public class DivideChocolates {
    public static int[] divideChocolates(int chocolates, int children) {
        return new int[]{chocolates / children, chocolates % children};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter chocolates and children: ");
        int chocolates = sc.nextInt(), children = sc.nextInt();
        int[] result = divideChocolates(chocolates, children);
        System.out.println("Each child gets " + result[0] + " chocolates, Remaining = " + result[1]);
        sc.close();
    }
}

