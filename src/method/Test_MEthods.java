package method;

import java.security.PublicKey;

public class Test_MEthods {

    public static void main(String[] args) {
    Test_MEthods t = new Test_MEthods(); //Crreat an object
    t.addition();                        //call instance method ussing name
    t.subtraction(20,10);
    t.printName("Testing","Codebuster");
    t.multiplication();
    Test_MEthods.division( 20,5);  //call static method direct
    division(15,3);
    }

    //No return type with no parameters or Instance method
    public void addition(){

        System.out.println("Codebuster Testing");

    }

    //2. No return type with parameters
    public void subtraction (int a, int b){
        System.out.println(a-b);


    }
    public void printName(String name, String name1){

        System.out.println(name);
        System.out.println(name1);
    }

    //3.With retun type with no parameters
    public int multiplication(){

        int a = 10; int b = 20;
        int result = a*b;
        System.out.println(result);
        return result;

    }

    //4. With return type with parameters

    public static int division (int a,int b){

        int result = a/b;
        System.out.println(result);
        return result;
    }



}
