import java.util.*;

public class MostFrequent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Map<Character, Integer> freq = new HashMap<>();
        for (char c : str.toCharArray())
            freq.put(c, freq.getOrDefault(c, 0) + 1);

        char mostFreq = ' ';
        int max = 0;
        for (var e : freq.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                mostFreq = e.getKey();
            }
        }
        System.out.println("Most Frequent Character: " + mostFreq);
    }
}

