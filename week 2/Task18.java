import java.util.*;

public class Task18 {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        
        deque.addLast(1);
        deque.addLast(2);
        deque.addLast(3);
        deque.addFirst(0);
        deque.addFirst(-1);
        
        System.out.println("Deque: " + deque);
        System.out.println("First: " + deque.getFirst());
        System.out.println("Last: " + deque.getLast());
        
        deque.removeFirst();
        deque.removeLast();
        
        System.out.println("After removing first and last: " + deque);
    }
}
