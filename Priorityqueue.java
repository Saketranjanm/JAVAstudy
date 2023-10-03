package Collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priorityqueue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(12);
        pq.add(13);
        pq.add(21);
        pq.add(11);
        System.out.println(pq);
        System.out.println(pq.element());
        System.out.println(pq.isEmpty());
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.remove());
        System.out.println(pq);
        pq.add(23);
        pq.add(34);
        pq.add(35);
        System.out.println(pq);

        Iterator itr = pq.iterator();
        while (itr.hasNext()) {
            Integer i = (Integer)itr.next();
            System.out.println(i);
        }
    }
    
}
