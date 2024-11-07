package StringManupulation;

    /**
     * Wrote a java program to reverse words in a String?
     */
public class ReverseAStringWordByWord {

    public static String reverseWords(String str){

        //Split the string into each words
        String [] words = str.split("\s");

        // create a string builder obj for placeholder
        StringBuilder reversed = new StringBuilder();

        // Iterate over the array and place them into stringBuilder obj
        for (int i = words.length - 1; i >= 0; i --){
            reversed.append(words[i]).append(" ");
        }
        return reversed.toString()
                        .trim();  //remove trailing white spaces

    }


    public static void main(String[] args) {

        String input = "Life is fun with Java";
        System.out.println(reverseWords(input));
    }
}
