public class recursion {
    public static int recursion1(int i, int k) {

        if (k == 50) {
            return i;

        } else {
            k++;
            return recursion1(i + k, k);
        }
    }

    public static void main(String[] args) {
        int j = recursion1(0, 0);
        System.out.println("the value of j is=" + j);
    }
}
