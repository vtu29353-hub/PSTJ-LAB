public class Task32 {
    public static void main(String[] args) {
        int number = 29;
        boolean prime = number > 1;

        for (int divisor = 2; divisor * divisor <= number; divisor++) {
            if (number % divisor == 0) {
                prime = false;
                break;
            }
        }

        System.out.println(prime ? "Prime" : "Not Prime");
    }
}