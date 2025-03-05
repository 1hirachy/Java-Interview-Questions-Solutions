package StringManupulation;

//Write a java program to remove all the spaces exist in the String
public class RemoveAllTheSpaces {

    public static String removeSpaces(String str) {

        if (str.length() == 0) {
            return "Invalid Input";
        } else {

            StringBuilder sb = new StringBuilder();

            for (char c : str.toCharArray()) {
                if (c != ' ') {
                    sb.append(c);
                }
            }

            return sb.toString();
        }
    }


    public static void main(String[] args) {

        String input = "Computer is computing !";
        System.out.println(removeSpaces(input));
    }
}
