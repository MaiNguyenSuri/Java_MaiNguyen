import java.util.Scanner;

public class baiTapDateTime {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input year: ");
        int year = scanner.nextInt();

        System.out.print("Input month: ");
        int month = scanner.nextInt();

        System.out.print("Input day: ");
        int day = scanner.nextInt();

        System.out.print("Input hour: ");
        int hour = scanner.nextInt();

        System.out.print("Input minute: ");
        int minute = scanner.nextInt();

        System.out.print("Input second: ");
        int second = scanner.nextInt();

        long timestamp = getTimestamp(year, month, day,
                hour, minute, second);
        System.out.println("The timestamp: " + timestamp);
    }

    private static boolean checkLeapYear(int year) {
        boolean namNhuan = (year % 4 == 0 && year % 100 != 0)
                || (year % 100 == 0 && year % 400 == 0);
        return namNhuan;
    }

    private static long getDaysOfMonth(int year, int month) {
        switch (month) {
            case 2:
                if (checkLeapYear(year)) {
                    return 29;
                }
                return 28;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                return 31;
            }
            case 4:
            case 6:
            case 9:
            case 11:
            default: {
                return 30;
            }
        }
    }

    private static long sumDaysToYear(int year) {
        int startYear = 1970;
        long day = 0l;
        for (int i = startYear; i <= year; i++) {
            day += 365;
            if (checkLeapYear(i)) {
                day += 1;
            }
        }
        return day;
    }

    private static long sumDaysToMonth(int year, int month) {
        long days = 0l;
        for (int i = 1; i <= month; i++) {
            days += getDaysOfMonth(year, i);
        }
        return days;
    }

    private static long getTimestamp(int year, int month, int date, int hour,
                                     int minute, int second) {
        long dayYear = sumDaysToYear(year - 1);
        long dayMonth = sumDaysToMonth(year, month - 1);

        long totalDays = dayYear + dayMonth + (date - 1);
        long totalSecondOfDays = totalDays * 86400;

        long timestamp = totalSecondOfDays + (hour * 60 * 60)
                + (minute * 60) + second;
        return timestamp;
    }
}