package homeworkweek06;

/*  Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.) */


public class Qut_05 {

    public static void main (String []args){

        Qut_05 q5 = new Qut_05(); //Craet  a object
        q5.addition(5,5); // Called static method for addition
        q5.substraction(5,5); // Called static method for substarction
        q5.multiplication(5,5);// Called static method for multiplication
        q5.division(5,5); // Called static method for division


    }
    public static int addition(int a,int b){

        int result = (a+b);
        System.out.println("Addition :- "+result);
        return result;
    }

    public static int substraction(int a, int b){
        int result = (a-b);
        System.out.println("Substarction :- "+result);
        return result;

    }

    public static int multiplication(int a, int b){

        int result = (a*b);
        System.out.println("Multiplication :- "+(result));
        return result;
    }

    public static int division (int a, int b){
        int result = (a-b);
        System.out.println("Division :- "+(result));
        return result;

    }
}
