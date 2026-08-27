import java.util.*;

public class Task19 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(10);
        
        System.out.println("HashSet: " + set);
        System.out.println("Size: " + set.size());
        System.out.println("Contains 20: " + set.contains(20));
        
        set.remove(30);
        System.out.println("After removing 30: " + set);
        
        for (int num : set) {
            System.out.println(num);
        }
    }
}
