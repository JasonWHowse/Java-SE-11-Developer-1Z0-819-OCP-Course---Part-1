/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 4: Using Operators and Decision Constructs
Topic: Switch Statements
Sub-Topic: Out of Ordinary
*/

public class SwitchOddities {
    public static void main(String[] args) {
        byte[] bytes = {100, 103, 104, 107, 126};
        String caseAssignedValue = "";

        // Create a label to use in switch statement
        start_for:
        for (var i : bytes) {   // Using LVTI here
            switch (i) {
                case 100:
                case 103:
                case 104:
                    // This is case block break
                    break;
                case 107:
                    caseAssignedValue = "Less than 110";
                    // This is a for loop break with label
                    break start_for;
                case 126:
                    caseAssignedValue = "Equal to 126";
                    break;
            }//switch (i) {
            System.out.println("Done processing " + i +
                    ", caseAssignedValue = " + caseAssignedValue);
        }//for (var i : bytes) {
    }//public static void main(String[] args) {
}//public class SwitchOddities { 