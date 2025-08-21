import java.util.Scanner;

public class CollinearPoints {

    // Method 1: Check collinearity using slope formula
    public static boolean isCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Avoid division by zero by using cross multiplication instead
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }

    // Method 2: Check collinearity using area of triangle formula
    public static boolean isCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example: A(2,4), B(4,6), C(6,8)
        System.out.print("Enter x1 y1: ");
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        System.out.print("Enter x2 y2: ");
        int x2 = sc.nextInt(), y2 = sc.nextInt();
        System.out.print("Enter x3 y3: ");
        int x3 = sc.nextInt(), y3 = sc.nextInt();

        System.out.println("\nUsing Slope Method: " +
                (isCollinearSlope(x1, y1, x2, y2, x3, y3) ? "Collinear" : "Not Collinear"));

        System.out.println("Using Area Method: " +
                (isCollinearArea(x1, y1, x2, y2, x3, y3) ? "Collinear" : "Not Collinear"));

        sc.close();
    }
}

