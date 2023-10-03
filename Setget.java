public class Setget {
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Setget s = new Setget();
        s.setAge(19);
        s.setName("saket");
        System.out.println("age= "+s.getAge());
        System.out.println("name= "+s.getName());
    }
}
