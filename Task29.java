import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task29 {
    public static void main(String[] args) {
        String text = "tree";
        Map<Character, Integer> counts = new HashMap<>();
        for (char character : text.toCharArray()) {
            counts.put(character, counts.getOrDefault(character, 0) + 1);
        }

        List<Character> characters = new ArrayList<>(counts.keySet());
        characters.sort((first, second) -> {
            int frequency = counts.get(second) - counts.get(first);
            return frequency != 0 ? frequency : Character.compare(first, second);
        });

        StringBuilder result = new StringBuilder();
        for (char character : characters) {
            result.append(String.valueOf(character).repeat(counts.get(character)));
        }
        System.out.println(result);
    }
}
