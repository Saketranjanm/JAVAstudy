package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(23);
        al.add(233);
        al.add(67);
        System.out.println(al);
        al.add(1, 56);
        System.out.println(al);
        ArrayList al1 = new ArrayList();
        al1.add(34);
        al1.add(22);
        System.out.println(al1);
        al1.addAll(al);
        System.out.println(al1);
//  fetching using for loop
        for (int i = 0; i < al1.size(); i++) {
            Object o = al1.get(i);
            System.out.println(o);
           
        } System.out.println("*******************************************************");
        // fetching using for each 
        for (Object o : al) {
            System.out.println(o);
        }
        System.out.println("*******************************************************");
        // fetching using iterator 
        Iterator itr = al1.iterator();
        while(itr.hasNext())     //checking next item is there in collection or not
        {
        Integer i =(Integer)itr.next();
        System.out.println(i);
        }
        

    }
}
