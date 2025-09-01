import java.time.*;
import java.util.*;

public class DateArithmetic {
    public static void processDate(LocalDate date) {
        LocalDate result = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println("Original Date: " + date);
        System.out.println("Final Date after operations: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date (yyyy-MM-dd): ");
        String input = sc.nextLine();
        LocalDate date = LocalDate.parse(input);
        processDate(date);
    }
}

