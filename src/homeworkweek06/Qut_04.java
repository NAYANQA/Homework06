package homeworkweek06;

/* Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme. */


public class Qut_04 {

    int n = 20; // intance variable
    String str = "NAYAN";// Intance variable
    static int m = 30; //Static varoable
    static String str1 = "PATEL"; // Static variable

    public static void main(String []args){
        Qut_04 q4 = new Qut_04(); //Create an object
        q4.n1(); //Called instance method
        System.out.println(q4.n);// Called instance vriable by object
        System.out.println(q4.str);
        System.out.println(m);
        System.out.println(str1);

    }

    void n1(){

        System.out.println(n); //Without object called instance variable using instnace method
        System.out.println(str);// called static variable using instance method
        System.out.println(m);
        System.out.println(str1);// called static variable using instnace method

    }

    static void s1(){

        Qut_04 q4=new Qut_04();//creat an object
        System.out.println(q4.n); // called instance variable by object
        System.out.println(m);
        System.out.println(q4.str); //Called static variable using by object
        System.out.println(str1); // called static variable by using static method

    }




}
