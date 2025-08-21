import java.util.Random;

public class RandomStats {

    public static int[] generate4DigitRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + rand.nextInt(9000); 
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int n : numbers) {
            sum += n;
            if (n < min) min = n;
            if (n > max) max = n;
        }
        double avg = (double) sum / numbers.length;
        return new double[]{ avg, min, max };
    }

    public static void main(String[] args) {
        int[] randoms = generate4DigitRandomArray(5);

        System.out.print("Random Numbers: ");
        for (int n : randoms) System.out.print(n + " ");
        System.out.println();

        double[] stats = findAverageMinMax(randoms);
        System.out.println("Average: " + stats[0]);
        System.out.println("Min: " + stats[1]);
        System.out.println("Max: " + stats[2]);
    }
}
