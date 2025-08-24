public class Pallindrome {
    public static boolean palindrome() {
        String s = "lever";
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {

            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else return false;
        }
        return true;
    }

    public static void main(String[] args) {

        if (palindrome()) System.out.println("the given string is a palindrome");
        else System.out.println("the given string is not a palindrome");
    }
}
