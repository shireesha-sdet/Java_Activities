package actJava;

import java.util.*;

public class Activity3_4 {
    public static void main(String[] args) {
        Deque<String> dq = new LinkedList<String>();

        dq.add("Tiger");
        dq.addFirst("Lion");
        dq.addLast("Wolf");
 
        dq.offer("Hyena");
        dq.offerFirst("Puma");
        dq.offerLast("Panther");

        Iterator<String> iterator = dq.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Peek: " + dq.peekFirst());
        System.out.println("Peek: " + dq.peekLast());
        System.out.println("After peek: " + dq);

        System.out.println("Contains Wolf?: " + dq.contains("Wolf"));

        dq.removeFirst();
        dq.removeLast();
        System.out.println("dq after removing first and last elements: " + dq);
        System.out.println("Size of deque after removal: " + dq.size());
    }
}
