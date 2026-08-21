import java.util.Arrays;

public class Task27 {
    public static void main(String[] args) {
        String[] numbers = {"3", "30", "34", "5", "9"};
        Arrays.sort(numbers, (first, second) -> (second + first).compareTo(first + second));

        StringBuilder result = new StringBuilder();
        for (String number : numbers) {
            result.append(number);
        }
        System.out.println(result.toString().replaceFirst("^0+", "").isEmpty() ? "0" : result);
    }
}
