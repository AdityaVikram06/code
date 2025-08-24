package javalikedquestions;
import java.util.*;

public class movezeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter size of the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array before moving zeroes:");
        System.out.println(Arrays.toString(arr));
        int insertPos = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[insertPos++] = arr[i];
            }
        }

        // Fill rest with zeros
        while (insertPos < n) {
            arr[insertPos++] = 0;
        }
        System.out.println("Array after moving zeroes:");
        System.out.println(Arrays.toString(arr));
    }
}
