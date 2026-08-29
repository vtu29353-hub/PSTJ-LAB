import java.util.ArrayList;

public class Task26 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Asha");
        names.add("Ravi");
        names.add("Meena");

        System.out.println(names);
        System.out.println(names.get(1));
        names.remove("Ravi");
        System.out.println(names);
    }
}
