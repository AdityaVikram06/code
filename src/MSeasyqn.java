import java.util.Arrays;
import java.util.Scanner;

public class MSeasyqn {

    public static int[] easyquestion(String s) {
        s = s.toLowerCase();
        int[] x = new int[s.length()];
        int k = 0;

        for (int i = 0; i < s.length(); ) {
            char a = s.charAt(i);
            int j = i;
            int y = 0;

            while (j < s.length() && s.charAt(j) == a) {
                y++;
                j++;
            }

            x[k++] = y;
            i = j;
        }

        return Arrays.copyOf(x, k);
    }

    public static String[] easyquestion1(String s) {
        s = s.toLowerCase();
        String[] s1 = new String[s.length()];
        int k = 0;

        for (int i = 0; i < s.length(); ) {
            char a = s.charAt(i);
            int j = i;

            while (j < s.length() && s.charAt(j) == a) {
                j++;
            }

            s1[k++] = String.valueOf(a);
            i = j;
        }

        return Arrays.copyOf(s1, k);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String s1 = scanner.nextLine();

        int[] x = easyquestion(s1);
        String[] s = easyquestion1(s1);

        System.out.print("The compressed string is = ");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] +"("+ s[i]+")"+",");
        }
        System.out.println();
    }
}
