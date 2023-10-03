package Collection;

import java.util.Iterator;
import java.util.TreeSet;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Treeset {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(12);
        ts.add(76);
        ts.add(89);
        ts.add(24);
        ts.add(90);
        System.out.println(ts);
        System.out.println(ts.higher(76));
        System.out.println(ts.lower(12));
        System.out.println(ts.ceiling(23));
        System.out.println(ts.floor(23));
        System.out.println("****************************************");
        Iterator itr = ts.iterator();
        while (itr.hasNext()) {
            Integer i = (Integer)itr.next();
            System.out.println(i);
        }
    }
    
}
