import java.util.HashMap;
import java.util.Map;

public class Task29 {
    public static void main(String[] args) {
        String text = "tree";
        Map<Character, Integer> frequency = new HashMap<>();

        for (char character : text.toCharArray()) {
            frequency.put(character, frequency.getOrDefault(character, 0) + 1);
        }

        StringBuilder result = new StringBuilder();
        frequency.entrySet().stream()
                .sorted((first, second) -> second.getValue() - first.getValue())
                .forEach(entry -> result.append(String.valueOf(entry.getKey()).repeat(entry.getValue())));

        System.out.println(result);
    }
}
