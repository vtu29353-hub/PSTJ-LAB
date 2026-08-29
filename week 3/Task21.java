import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task21 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2015, 8, 5);
        String day = date.format(DateTimeFormatter.ofPattern("EEEE"));
        System.out.println(day.toUpperCase());
    }
}
