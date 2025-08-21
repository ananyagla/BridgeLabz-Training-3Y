import java.util.Scanner;

public class TrignometricCalculator {

    // Method to calculate sine, cosine, tangent
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);

        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input angle
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        // Calculate trig values
        double[] results = calculateTrigonometricFunctions(angle);

        System.out.println("Sine(" + angle + "°) = " + results[0]);
        System.out.println("Cosine(" + angle + "°) = " + results[1]);
        System.out.println("Tangent(" + angle + "°) = " + results[2]);

        sc.close();
    }
}

