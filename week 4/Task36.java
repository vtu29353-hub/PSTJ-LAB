import java.util.Arrays;

public class Task36 {
    public static void main(String[] args) {
        String first = "listen";
        String second = "silent";
        char[] firstLetters = first.toCharArray();
        char[] secondLetters = second.toCharArray();
        Arrays.sort(firstLetters);
        Arrays.sort(secondLetters);

        System.out.println(Arrays.equals(firstLetters, secondLetters) ? "Anagram" : "Not Anagram");
    }
}