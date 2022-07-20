package method;

public class Test {

    int eid;
    String name;

    public static void main(String[] args) {
        Test t= new Test(111, "bhav");
        t.display();
        Test t1=new Test(222,"gaurang");
        t1.display();
        Test t3=new Test(333,"sapna");
        t3.display();

    }

     Test(int eid, String name){
       /* eid=111;
        name="bhav";*/
        this.eid=eid;
        this.name=name;
    }
    void display(){
        System.out.println(eid);
        System.out.println(name);
    }

    
}
