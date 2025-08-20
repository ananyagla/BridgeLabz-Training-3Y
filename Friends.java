import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        int[] height = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + names[i] + ": ");
            age[i] = sc.nextInt();
            System.out.println("Enter height of " + names[i] + ": ");
            height[i] = sc.nextInt();
        }

        int youngestIndex = 0, tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex])
                youngestIndex = i;
            if (height[i] > height[tallestIndex])
                tallestIndex = i;
        }

        System.out.println("Youngest Friend: " + names[youngestIndex]);
        System.out.println("Tallest Friend: " + names[tallestIndex]);
    }
}
