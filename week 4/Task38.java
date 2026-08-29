import java.util.LinkedHashSet;
import java.util.Set;

public class Task38 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 5};
        Set<Integer> uniqueNumbers = new LinkedHashSet<>();

        for (int number : numbers) {
            uniqueNumbers.add(number);
        }

        System.out.println(uniqueNumbers);
    }
}