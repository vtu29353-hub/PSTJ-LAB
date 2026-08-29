public class Task37 {
    public static void main(String[] args) {
        int[] numbers = {12, 35, 1, 10, 34, 1};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }

        System.out.println(secondLargest);
    }
}