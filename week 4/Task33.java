public class Task33 {
    public static void main(String[] args) {
        int number = 5;
        long factorial = 1;

        for (int value = 2; value <= number; value++) {
            factorial *= value;
        }

        System.out.println(factorial);
    }
}