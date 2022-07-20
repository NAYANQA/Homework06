package homeworkweek06;

/*15. Write a Java program to swap two variables.*/

public class Qut_15 {

    //Main method
    public static void main (String[] args) {
        int x = 25;
        int y = 52;
        System.out.println("Original values of x and y");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        x = x ^ y ^ (y = x);  // using fromula for swap a variable
        System.out.println("Swapped values of x and y");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }


}
