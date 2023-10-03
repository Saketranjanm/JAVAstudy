
public class instancecounter { 
    private  static int counter=0;
    public  instancecounter(){
        counter++;
    }
    public static int getinstancecounter(){
        return counter;
    }
        public static void main(String[] args) {
           
            instancecounter a= new instancecounter();
            instancecounter a2= new instancecounter();
            instancecounter a3= new instancecounter();
            int count = instancecounter.getinstancecounter();
            System.out.println("Number of instances created: " + counter);
        }
    }
