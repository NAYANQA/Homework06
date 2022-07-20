package method;

public class Instance_Static_Area {
    //Instance Atra or static Area

    int a =1;  // Declare instance variable
    static String name = "Jave is a secure Language"; // Declare static variable



    public static void main(String args[]){
        // Static area

        //Crate a Object
        // Where Insance_statics_Area is a class name isa is and pbject new is a keyword and Instance_Staoc_Area() is a constuctor
        Instance_Static_Area isa = new Instance_Static_Area();
        System.out.println(isa.a); // called instance variable using object name
        System.out.println(name);
        Instance_Static_Area.m2();  // static method called cia class name
        m2(); //static method called direct
        isa.m1(); // instance method via object name


    }

    //calling :- Instance Variable to Instance area :- Direct
    //Calling :- Static variable to Static area :- Direct
    //Calling :- Instance variable to Static area :- via crating object and using object name
    //Calling  :- static variable to Instance area :- Direct or cia class name
    void m1(){  //Declare Instance method

        //Instance Area
        int x =10;
        System.out.println(x);
        System.out.println(a);
        m2();
        Instance_Static_Area.m2();
      //  Instance_Static_Area isa = new Instance_Static_Area();

    }

    static void  m2(){  // Declare static method
        //static are
        int y = 5;
        System.out.println(y);
        Instance_Static_Area isa = new Instance_Static_Area();
        System.out.println(isa.a);
    }
}
