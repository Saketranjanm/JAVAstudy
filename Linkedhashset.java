package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class Linkedhashset {
    public static void main(String[] args) {
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(12);
        lhs.add(13);
        lhs.add(14);
        lhs.add(15);
        System.out.println(lhs);
       Iterator lit = lhs.iterator();
       while (lit.hasNext()) {
        Integer o = (Integer)lit.next();
        System.out.println(o);
       }
        }

    }

