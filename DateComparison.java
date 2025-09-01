import java.time.*;
import java.util.*;

public class DateComparison {
    public static void compareDates(LocalDate d1, LocalDate d2) {
        if (d1.isBefore(d2)) {
            System.out.println(d1 + " is before " + d2);
        } else if (d1.isAfter(d2)) {
            System.out.println(d1 + " is after " + d2);
        } else if (d1.isEqual(d2)) {
            System.out.println(d1 + " is the same as " + d2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first date (yyyy-MM-dd): ");
        LocalDate d1 = LocalDate.parse(sc.nextLine());

        System.out.print("Enter second date (yyyy-MM-dd): ");
        LocalDate d2 = LocalDate.parse(sc.nextLine());

        compareDates(d1, d2);
    }
}

