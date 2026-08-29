import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Task22 {
    public static void main(String[] args) {
        LocalDate firstDate = LocalDate.of(2019, 6, 29);
        LocalDate secondDate = LocalDate.of(2019, 6, 30);
        long days = Math.abs(ChronoUnit.DAYS.between(firstDate, secondDate));
        System.out.println(days);
    }
}
