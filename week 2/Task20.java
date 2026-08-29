import java.util.HashSet;                                                                      
import java.util.Set;

public class Task20 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("Java");
        System.out.println(set);
        System.out.println(set.contains("Java"));
    }
}