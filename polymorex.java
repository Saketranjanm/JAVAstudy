class Animal{
    public void act(){
        System.out.println("Animals acts on certain things");
    }

    public void read(){
        System.out.println("Animals not read");
    }
}

class Dog extends Animal {
    public void act(){
        System.out.println("Dog acts on certain things");
    }

    public void read(){
        System.out.println("Dog not read");
    }
}

class Tiger extends Animal{
    public void act(){
        System.out.println("Tiger acts on certain things");
    }

    public void read(){
        System.out.println("Tiger not read");
    }
}

class Deer extends Animal{
    public void act(){
        System.out.println("Deer acts on certain things");
    }

    public void read(){
        System.out.println("Deer not read");
    }
}

class Superanimal{
         public void don(Animal a){
                  a.act();
                  a.read();
                  System.out.println("-------------------------------------------");
         }
}




public class polymorex {
    public static void main(String[] args) {
        Dog d = new Dog();
        Deer de = new Deer();
        Tiger t = new Tiger();

        Superanimal s = new Superanimal();
        s.don(d);
        s.don(de);
        s.don(t);

    }
    
}
