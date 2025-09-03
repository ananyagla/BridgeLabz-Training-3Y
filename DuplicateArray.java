public class DuplicateArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40, 50, 10};

        System.out.println("Duplicate elements in the array:");

        // Outer loop
        for (int i = 0; i < arr.length; i++) {
            // Inner loop
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
