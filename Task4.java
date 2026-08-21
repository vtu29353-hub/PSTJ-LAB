public class Task4 {
    public static void main(String[] args) {
        int a = 12, b = 8, c = 19;
        int largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;
        System.out.println("Largest number: " + largest);
    }
}
