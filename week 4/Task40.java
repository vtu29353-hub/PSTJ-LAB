import java.util.Arrays;

public class Task40 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int positions = 2;
        int[] rotated = new int[numbers.length];

        for (int index = 0; index < numbers.length; index++) {
            rotated[(index + positions) % numbers.length] = numbers[index];
        }

        System.out.println(Arrays.toString(rotated));
    }
}