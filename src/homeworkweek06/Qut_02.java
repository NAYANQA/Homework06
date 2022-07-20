package homeworkweek06;

/* Write a Java programme using the following steps.
2.1 Declare two static variables
2.2 Declare one static method
2.3 Call both static variables into the static method inside the print
statement. 2.4 Declare the Main method.
2.5 Call the static method into the Main method and Run the programme. */


public class Qut_02 {

        static int a = 10;//Declare Staic variable
        static String str = "NAYAN"; // Declare startic variable

        //Main method (User define method)
        public static void main (String[] args){

            System.out.println(a);
            System.out.println(str);

        }

        static void s1() // Declare static method
        {
            System.out.println(a); //Called static variable by using static method
            System.out.println(str); // Called static variable by using static method

        }
}
