import java.util.Scanner;

public class DistanceAndLine {

    // Method to compute Euclidean distance
    public static double euclideanDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to compute slope and y-intercept
    public static double[] lineEquation(int x1, int y1, int x2, int y2) {
        double m = (double)(y2 - y1) / (x2 - x1);   // slope
        double b = y1 - (m * x1);                   // intercept
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 y1: ");
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        System.out.print("Enter x2 y2: ");
        int x2 = sc.nextInt(), y2 = sc.nextInt();

        double distance = euclideanDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance = %.2f\n", distance);

        double[] line = lineEquation(x1, y1, x2, y2);
        System.out.printf("Equation of Line: y = %.2f*x + %.2f\n", line[0], line[1]);

        sc.close();
    }
}

