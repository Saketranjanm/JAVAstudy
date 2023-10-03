class Test{
    // instance variable
    int a;
    String name = "rahul";


    public static void main(String []args){
        int num;
       Test obj1 = new Test();
       Test obj2 = new Test();
       System.out.println(obj1.name);
       obj1.name = "saket";
       System.out.println(obj1.name);
       System.out.println(obj2.name);

    }
}