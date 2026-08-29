public class Task34 {
    public static void main(String[] args) {
        int terms = 10;
        int first = 0;
        int second = 1;

        for (int count = 0; count < terms; count++) {
            System.out.print(first + (count == terms - 1 ? "" : " "));
            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
    }
}