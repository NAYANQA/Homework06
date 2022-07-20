package homeworkweek06;

/* Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.

3.4 Call both instance and static variables i
nto both instance and static methods inside the print statement.

3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.*/


public class Qut_03 {


    static int a =20; // Declare static variable
    String str = "NAYAN";//Declare instance variable

    public static void main (String []args){

        Qut_03 q=new Qut_03();
        q.p3();
        System.out.println(q.str);
        System.out.println(a);

    }

    void p3() // Intance variable
    {
        Qut_03 q3 =new Qut_03();
        System.out.println(q3.str);
        System.out.println(a);

    }
    static void s1()//Static method
    {
        System.out.println(a); //Called static variable directly
        Qut_03 b = new Qut_03();
        System.out.println(b.str);

    }


}
