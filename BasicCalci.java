import java.util.*;

public class BasicCalci {
    public static int add(int a, int b) { return a + b; }
    public static int subtract(int a, int b) { return a - b; }
    public static int multiply(int a, int b) { return a * b; }
    public static double divide(int a, int b) { return (double)a / b; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose operation: 1.Add 2.Subtract 3.Multiply 4.Divide");
        int choice = sc.nextInt();
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        switch (choice) {
            case 1: System.out.println("Result: " + add(a, b)); break;
            case 2: System.out.println("Result: " + subtract(a, b)); break;
            case 3: System.out.println("Result: " + multiply(a, b)); break;
            case 4: 
                if (b != 0) System.out.println("Result: " + divide(a, b));
                else System.out.println("Error: Division by zero!");
                break;
            default: System.out.println("Invalid choice!");
        }
    }
}

