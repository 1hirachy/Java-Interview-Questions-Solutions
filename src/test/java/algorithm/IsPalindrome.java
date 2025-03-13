package algorithm;

    /**
     * Given an integer x, return true if x is a palindrome, and false otherwise.
     */


public class IsPalindrome {

    public static boolean isPalindrome(int x) {

        // if the value is negative it will return false
        if (x < 0){
            return false;
        }

        int reversed = 0;
        int temp = x;

        while(x > 0){
            reversed = (reversed * 10) + (x % 10);
            x /= 10;
        }

        return (reversed == temp);
    }


    public static void main(String[] args) {

        int input = 121;
        int badInput = 1212;

        System.out.println(isPalindrome(input));
        System.out.println(isPalindrome(badInput));
    }
}
