package Collection;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Arraydeque {
    public static void main(String[] args) {
        ArrayDeque a = new ArrayDeque();
        a.add(67);
        a.add(678);
        a.add(69);
        a.add(677);
        System.out.println(a);
        a.addFirst(12);
        a.addFirst(11);
        System.out.println(a);
       a.addLast(17);
       System.out.println(a);
     System.out.println( a.getFirst()); 
     System.out.println( a.getLast()); 
     System.out.println("************************************************************");
     Iterator itr = a.iterator();
     while (itr.hasNext()) {
        Integer o = (Integer)itr.next();
        System.out.println(o);
        
     }

    }
   

}
