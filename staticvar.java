class student{


    static String name;
    static int age;

    int age2;
    String name2;

    static{
        System.out.println("static block");
        name = "saket";
        age =21;
    }

    {
        System.out.println("non static block");
        age2 = 22;
        name2 = "ranjan";
    }

    static void disp(){
        System.out.println("static method"+name +age);
    }

    void disp2(){
        System.out.println("non static method"+name2+ age2);
    }
}

public class staticvar {
   public static void main(String[] args) {
    
    student s = new student();
    student.disp();
    s.disp2();
   }
}
