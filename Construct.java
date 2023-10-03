 class Con{
    static {
        System.out.println("Static block is executed.");
    }
    private String name;
    private int age;
  
    Con(String name,int age){
        this.name =name;
        this.age = age;
    }
    Con(int age){
        this.age = age;
    }

    public void disp(){
        System.out.println(name);
        System.out.println(age);
    }
}
public class Construct {

 public static void main(String[] args) {
      Con c1 = new Con("shubham",22);
      c1.disp();
      Con c2 = new Con(18);
      c2.disp();
 }
}
