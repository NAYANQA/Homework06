package homeworkweek5;
/*Make your 12th marksheets on your own. “BE CREATIVE”
All marks in your marksheets has to be in form of variables.*/
public class MarkSheet_12 {

    //Main method

       public static void main(String args []){
            String name ="Nayankumar Babubhai Patel";
            //using integer variable
            int m1 = 89;
            int m2 = 70;
            int m3 = 80;
            int m4 = 98;
            int m5 = 75;
            int m6 = 90;
            int m7 = 89;
            int t1 = 100;
            int t2 = (t1*7);
            int t = m1+m2+m3+m4+m5+m6+m7;

            System.out.println("GUJARAT SECONDARY AND HIGHER SECONDARY EDUCATION BOARD");
            System.out.println("                   GANDHINAGAR                             ");
            System.out.println("Student Name :- "+name); // Print a Name of student
            System.out.println("------------------------------------------");
            System.out.println("Subject        Total Marks         Marks"); //Print a heading of marksheet table
            System.out.println("------------------------------------------");
            System.out.println("ENGLISH          "+t1+"              "+m1);
            System.out.println("MATHEMATICS-1    "+t1+"              "+m2);
            System.out.println("MATHEMATICS-2    "+t1+"              "+m3);
            System.out.println("CHEMESTRY        "+t1+"              "+m4);
            System.out.println("PHYSICS          "+t1+"              "+m5);
            System.out.println("BIOLOGY          "+t1+"              "+m6);
            System.out.println("COMPUTER         "+t1+"              "+m6);
            System.out.println("------------------------------------------");
            System.out.println("Total            "+t2+"             "+t); //Print a totla marks and obtain marks

        }
    }

