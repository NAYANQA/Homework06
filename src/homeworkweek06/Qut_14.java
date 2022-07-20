package homeworkweek06;

/* 14. Write a Java program to print the area and perimeter of a rectangle.

Test Data:
Width = 5.5 Height = 8.5 */

public class Qut_14 {
    //Main method
    public static void main (String [] args){
        float W = 5.6f;
        float H = 8.5f;
        float Area = (W*H); // fromula for Area
        float Perimeter = (2*(W+H)); // Formula for Perimeter

        System.out.println("Area is 5.6 * 8.5 ="+Area); // Print a result of Area
        System.out.println("Perimeter is 2 * (5.6 + 8.5) = "+Perimeter);

    }
}
