import java.util.Arrays;

public class NumberChecker {

    // Method to count digits
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // Method to store digits in array
    public static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }

    // Method to check Duck number
    public static boolean isDuck(int num) {
        int[] digits = getDigits(num);
        for (int d : digits) {
            if (d == 0) return true;
        }
        return false;
    }

    // Method to check Armstrong number
    public static boolean isArmstrong(int num) {
        int[] digits = getDigits(num);
        int power = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == num;
    }

    // Method to find largest and second largest
    public static int[] largestTwo(int[] digits) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find smallest and second smallest
    public static int[] smallestTwo(int[] digits) {
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    // Method to sum digits
    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    // Method to sum squares of digits
    public static int sumSquaresDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    // Method to check Harshad number
    public static boolean isHarshad(int num) {
        int[] digits = getDigits(num);
        int sum = sumDigits(digits);
        return num % sum == 0;
    }

    // Method to find frequency of digits
    public static int[][] digitFrequency(int num) {
        int[] digits = getDigits(num);
        int[][] freq = new int[10][2]; // digit, count
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }
        for (int d : digits) {
            freq[d][1]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        int number = 153; // try different numbers
        int[] digits = getDigits(number);

        System.out.println("Number: " + number);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Count of digits: " + countDigits(number));

        System.out.println("Duck Number? " + isDuck(number));
        System.out.println("Armstrong Number? " + isArmstrong(number));
        System.out.println("Harshad Number? " + isHarshad(number));

        int[] largest = largestTwo(digits);
        System.out.println("Largest = " + largest[0] + ", Second Largest = " + largest[1]);

        int[] smallest = smallestTwo(digits);
        System.out.println("Smallest = " + smallest[0] + ", Second Smallest = " + smallest[1]);

        System.out.println("Sum of digits = " + sumDigits(digits));
        System.out.println("Sum of squares of digits = " + sumSquaresDigits(digits));

        int[][] freq = digitFrequency(number);
        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + " occurs " + freq[i][1] + " times");
            }
        }
    }
}

