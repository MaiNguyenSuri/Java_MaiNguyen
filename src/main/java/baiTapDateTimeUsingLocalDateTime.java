/* Nhập vào int ngày, int tháng, int năm, int giờ, int phút, int giây, phát sinh ra timestamp (giây).
Nhập vào timestamp giây phát sinh ra ngày tháng năm giờ phút giây
* 1) không dùng class hổ trợ ngày tháng năm chỉ dùng if for white
* 2) dùng các class hổ trợ ngày tháng năm*/

import javafx.util.converter.LocalDateStringConverter;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalField;
import java.util.Scanner;

public class baiTapDateTimeUsingLocalDateTime {
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ngày: ");
        int day = scanner.nextInt();

        System.out.print("Nhập tháng: ");
        int month = scanner.nextInt();

        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();

        System.out.print("Nhập giờ: ");
        int hour = scanner.nextInt();

        System.out.print("Nhập phút: ");
        int minute = scanner.nextInt();

        System.out.print("Nhập giây: ");
        int second = scanner.nextInt();
       convertToTimestemp(year,month,day,hour,minute,second);

        scanner.close();
    }

    public static void convertToTimestemp(int year, int month, int day, int hour, int minute, int second)
    {
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("Ngầy giờ vừa nhập là: ");
        LocalDateTime ldt = LocalDateTime.of(year, month, day, hour, minute, second);
        System.out.println(ldt);

        Timestamp timestamp = Timestamp.valueOf(ldt);

        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("Chuyển đổi từ định dạng ngày tháng năm giờ phút giây sang Timestemp: ");
        System.out.println(timestamp.getTime());

        System.out.println("---------------------------------------------------------------------------------------------------");
        ldt = timestamp.toLocalDateTime();
        System.out.println("Chuyển đổi tử Timestem sang định dạng Ngày Tháng Năm Giờ Phút Giây: ");
        System.out.println(ldt);

    }
}
