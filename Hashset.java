package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
            hs.add(12);
            hs.add(122);
            hs.add(67);
            hs.add(13);
            System.out.println(hs);
            Iterator itr = hs.iterator();
            while (itr.hasNext()) {
                Integer i = (Integer)itr.next();
                System.out.println(i);
                
            }

    }
    
}
