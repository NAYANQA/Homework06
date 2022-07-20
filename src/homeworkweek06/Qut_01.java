package homeworkweek06;

/* Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print
statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the![](../../../../AppData/Local/Temp/e7de363b-70fc-4ca4-85be-1fbf8e21f043.jpg) Main method and Run the programme. */


public class Qut_01 {

    int a = 10; // Instant variable
    String str = "NAYAN";

    //Main method
    public static void main (String [] args){
        Qut_01 q=new Qut_01(); //Creat a object
        q.p1();//called intance method by object

    }

    void p1() //Instance Method
    {
    System.out.println(a); //Instantce method call instance variable
    System.out.println(str);//Instance method call instance variable

    }



}
