import java.util.Arrays;
import java.util.Comparator;

public class Task30 {
    public static void main(String[] args) {
        String[] words = {"Java", "is", "easy", "to", "learn"};
        Arrays.sort(words, Comparator.comparingInt(String::length).thenComparing(String::compareTo));
        System.out.println(Arrays.toString(words));
    }
}
