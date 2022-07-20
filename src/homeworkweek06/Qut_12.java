package homeworkweek06;
/* Write a Java program to compute the specified expressions and print the
output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) */


public class Qut_12 {

    public static void main (String []args){

        float a =25.5f;
        float b = 3.5f;
        float c = 40.5f;
        float d = 4.5f;
        float m = ((a*b-b*b)/(c-d)); // applay variable in given formula

        System.out.println("Expected Output :" +m); // print a ans.
    }



}
