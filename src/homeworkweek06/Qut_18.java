package homeworkweek06;

/*Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5*/

public class Qut_18 {
    //Main Method
 public static void main (String [] args){
     int a = 125;
     int b = 24;

     System.out.println("Expected Output:");
     System.out.println("125+24 ="+(a+b)); //Addition of two variable
     System.out.println("125-24 ="+(a-b)); //Substaction of  two variable
     System.out.println("125*24 ="+(a*b)); // Multiplication of two variable
     System.out.println("125/24 ="+(a/b)); // Division of two variable
     System.out.println("125 mod 24 ="+(a%b));// mod of two variable
 }


}
