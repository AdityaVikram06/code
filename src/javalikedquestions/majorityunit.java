package javalikedquestions;
import java.util.*;

public class majorityunit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> repeat = new HashMap<>();
        System.out.println("Enter size of the array:");
        int w= scanner.nextInt();
        int[] arr = new int[w];
        System.out.println("Enter "+w+" numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }


        for (int num : arr) {
            repeat.put(num, repeat.getOrDefault(num, 0) + 1);
        }


        List<Integer> keys = new ArrayList<>();
        int searchValue = arr.length/2;
        for (Map.Entry<Integer, Integer> entry : repeat.entrySet()) {
            if (entry.getValue() > searchValue) {
                keys.add(entry.getKey());
            }
        }


        if (!keys.isEmpty()) {
            System.out.println("The majority unit(s) whose occurrence is more than " + searchValue + " are: " + keys);
        } else {
            System.out.println("No number occurs exactly " + searchValue + " time(s).");
        }
    }
}
