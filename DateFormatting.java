import java.time.*;
import java.time.format.*;

public class DateFormatting {
    public static void formatDate(LocalDate date) {
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("Format 1: " + date.format(format1));
        System.out.println("Format 2: " + date.format(format2));
        System.out.println("Format 3: " + date.format(format3));
    }

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        formatDate(today);
    }
}

