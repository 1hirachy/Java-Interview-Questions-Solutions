package StringManupulation;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(usingStringBuilder("noan"));
        System.out.println(reverseWord(" I Love Noan"));
    }

    public static String usingStringBuilder(String str){

        if (str == null || str.length() > 0){
            return "Invalid Entry";
        } else {
            // we will break down the string into individual character
            StringBuilder s = new StringBuilder(); // creating a new String builder obj
            s.append(str); // adding the existing String to new obj
            s.reverse(); // reversing the new obj
            return s.toString(); // converting back to String
        }
    }

    public static String reverseWord(String str){

        String [] words = str.split("\\s+");
        StringBuilder reversed = new StringBuilder();

        // using for loop to iterate over the sentence back-words
//        for( int i = words.length - 1; i >= 0; i--){
//
//            reversed.append(words[i]).append(" ");
//        }

        // using StringBuilder class method to reverse
        for(String word : words){
            reversed.append(new StringBuilder(word).reverse().append(" "));
        }
        return reversed.toString().trim();
    }
}






