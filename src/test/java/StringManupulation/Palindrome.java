package StringManupulation;

    /**
     * Wrote a java program to check if the String is Palindrome
     */
public class Palindrome {

    public static boolean isPalindrome(String str) {

        // converted the string to lowercase to make it case-sensitive
        str = str.toLowerCase();

        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();

        if (str.equals(stringBuilder.toString())){
        // alternative approach(stringBuilder.reverse().toString().equals(str)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        String input = "RAcecar";
        System.out.println(isPalindrome(input));

    }
}

