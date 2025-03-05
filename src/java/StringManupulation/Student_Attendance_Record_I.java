package StringManupulation;


/**
 * You are given a string s representing an attendance record for a student where each character signifies whether the student was absent, late, or present on that day. The record only contains the following three characters:
 * <p>
 * 'A': Absent.
 * 'L': Late.
 * 'P': Present.
 * The student is eligible for an attendance award if they meet both of the following criteria:
 * <p>
 * The student was absent ('A') for strictly fewer than 2 days total.
 * The student was never late ('L') for 3 or more consecutive days.
 * Return true if the student is eligible for an attendance award, or false otherwise.
 */
public class Student_Attendance_Record_I {


    public static boolean checkRecord(String s) {

        int lateCount = 0;
        int absentCount = 0;

        //Iterate through the string: We loop through the string to check each character.
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            //Track absences: We count the number of absences ('A'). If the count exceeds 1, return false.
            if (c == 'A') {
                absentCount++;
                if (absentCount >= 2) return false;
            }

            if (c == 'L') {
                lateCount++;
                if (lateCount >= 3) return false; // 3 consecutive 'L' are not allowed
            } else {
                lateCount = 0; // Reset late count if character is not 'L'
            }

        }
        return true;
    }

    public static void main(String[] args) {

        String s1 = "LALL";
        String s2 = "ALPL";
        String s3 = "PPALLA";
        String s4 = "PALPAPL";

        System.out.println(checkRecord(s1));
        System.out.println(checkRecord(s1));
        System.out.println(checkRecord(s3));
        System.out.println(checkRecord(s4));


    }
}
