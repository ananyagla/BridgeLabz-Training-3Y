import java.util.Scanner;

public class CalenderDisplay {

    // Month names
    private static final String[] MONTHS = { "", "January", "February", "March", "April", "May", "June",
                                             "July", "August", "September", "October", "November", "December" };

    // Days in each month
    private static final int[] DAYS = { 0, 31, 28, 31, 30, 31, 30,
                                        31, 31, 30, 31, 30, 31 };

    // Leap year check
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    // Number of days in a month
    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) return 29;
        return DAYS[month];
    }

    // Zeller’s congruence algorithm to find first day of month
    public static int getFirstDay(int month, int year) {
        int q = 1;
        if (month == 1) { month = 13; year--; }
        if (month == 2) { month = 14; year--; }

        int k = year % 100;
        int j = year / 100;
        int h = (q + (13 * (month + 1)) / 5 + k + k/4 + j/4 + (5*j)) % 7;

        return ((h + 6) % 7); // convert to 0=Sunday, 1=Monday, ...
    }

    // Print Calendar
    public static void printCalendar(int month, int year) {
        System.out.println("\n    " + MONTHS[month] + " " + year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDay(month, year);
        int daysInMonth = getDaysInMonth(month, year);

        // spacing
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%4d", day);
            if ((day + firstDay) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        printCalendar(month, year);
        sc.close();
    }
}

