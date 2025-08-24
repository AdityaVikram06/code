package javalikedquestions;
import java.util.*;

public class singleunit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> repeat = new HashMap<>();

        int[] arr = new int[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        // Count frequency of each number
        for (int num : arr) {
            repeat.put(num, repeat.getOrDefault(num, 0) + 1);
        }

        // Collect numbers with frequency = 1
        List<Integer> keys = new ArrayList<>();
        int searchValue = 1;
        for (Map.Entry<Integer, Integer> entry : repeat.entrySet()) {
            if (entry.getValue() == searchValue) {
                keys.add(entry.getKey());
            }
        }

        // Print results
        if (!keys.isEmpty()) {
            System.out.println("The single unit(s) whose occurrence is " + searchValue + " are: " + keys);
        } else {
            System.out.println("No number occurs exactly " + searchValue + " time(s).");
        }
    }
}
