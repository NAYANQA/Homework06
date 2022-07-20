package homeworkweek06;

/* Write a program to insert any temperature value in degree Fahrenheit and convert
to degree Celsius ((F − 32) × 5/9 = 0°C). */

public class Qut_08 {

    public static void main (String []args){

        float Fahrenheit, Celsius; // using float variable
        Fahrenheit = 43;
        Celsius  = ((Fahrenheit-32)*5)/9; //Formula for celsius
        System.out.println("Temperature in celsius is: "+Celsius);

    }
}
