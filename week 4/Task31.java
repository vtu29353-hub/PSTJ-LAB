public class Task31 {
    public static void main(String[] args) {
        int number = 1221;
        int original = number;
        int reversed = 0;

        while (number > 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }

        System.out.println(original == reversed ? "Palindrome" : "Not Palindrome");
    }
}