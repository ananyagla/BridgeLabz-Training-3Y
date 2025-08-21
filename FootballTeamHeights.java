import java.util.Random;

public class FootballTeamHeights {

    // Method to calculate sum of elements
    public static int sum(int[] arr) {
        int total = 0;
        for (int val : arr) total += val;
        return total;
    }

    // Method to calculate mean
    public static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    // Method to find shortest height
    public static int shortest(int[] arr) {
        int min = arr[0];
        for (int val : arr) {
            if (val < min) min = val;
        }
        return min;
    }

    // Method to find tallest height
    public static int tallest(int[] arr) {
        int max = arr[0];
        for (int val : arr) {
            if (val > max) max = val;
        }
        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] heights = new int[11];

        // Generate random heights between 150 and 250
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + rand.nextInt(101); // 150–250
        }

        System.out.print("Players' heights: ");
        for (int h : heights) System.out.print(h + " ");
        System.out.println();

        System.out.println("Shortest height = " + shortest(heights) + " cm");
        System.out.println("Tallest height = " + tallest(heights) + " cm");
        System.out.println("Mean height = " + mean(heights) + " cm");
    }
}
