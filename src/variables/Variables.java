package variables;

public class Variables {

    //Local Variable:-


    int a=10; //instance variable or Global variable
    static int b =20; //static variable or Global variable
    static String name1 = "JAVA";

    public static void main(String args[]){
        String name = "Codebuster"; //Local variable
        System.out.println(name); //called locacle variable
        System.out.println(b);// Called Static vatable
        Variables var = new Variables(); //Creat an object

        System.out.println(var.a); //Called variable using object


    }

    void add (){ //User defneed method and instance method

            //x,y are local variables.
        int x=5;
        int y= 10;
        System.out.println(x);// Called local variable direct.
        System.out.println(y);
        System.out.println(b); //Called Static variable using class name.
        System.out.println(Variables.name1); // called static variable using class name.

    }

    static void test(){ // Static method
    // m, n are local variables.

        int m= 100;
        int n=200;
        Variables var = new Variables();
        System.out.println(m);
        System.out.println(n);
        System.out.println(var.a);
    }

    // Constructore name and class name should be same.
    Variables(){ // Create constructore

        String  name2 ="Java is an object oriented Program language";
    }
    // Instance block

    {
        int m1 = 25;
        System.out.println(m1);

    }

    // Static block

    static {

        boolean result = true;
        System.out.println(result);

    }



}



