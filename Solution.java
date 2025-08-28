public class Solution {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 2, 7, 4, 9};
        
        boolean foundDuplicate = false;

    
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate found: " + arr[i]);
                    foundDuplicate = true;
                }
            }
        }

        if (!foundDuplicate) {
            System.out.println("Not found");
        }
    }
}
