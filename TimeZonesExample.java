import java.time.*;

public class TimeZonesExample {
    public static void displayTime(String zoneId) {
        ZonedDateTime time = ZonedDateTime.now(ZoneId.of(zoneId));
        System.out.println(zoneId + ": " + time);
    }

    public static void main(String[] args) {
        displayTime("GMT");   // Greenwich Mean Time
        displayTime("Asia/Kolkata"); // IST
        displayTime("America/Los_Angeles"); // PST
    }
}

