import java.util.Scanner;

public class QuadraticRoots {

    public static double[] findRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta < 0) return new double[0]; // no real roots
        else if (delta == 0) return new double[]{ -b / (2 * a) };
        else {
            double sqrtDelta = Math.sqrt(delta);
            return new double[]{
                (-b + sqrtDelta) / (2 * a),
                (-b - sqrtDelta) / (2 * a)
            };
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double[] roots = findRoots(a, b, c);
        if (roots.length == 0) System.out.println("No real roots.");
        else {
            for (int i = 0; i < roots.length; i++) {
                System.out.println("Root " + (i + 1) + ": " + roots[i]);
            }
        }
    }
}

