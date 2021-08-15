import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*Cho ngày, tháng, năm – day, month, year, yêu cầu:
        Xét xem ngày, tháng, năm này có hợp lệ hay không?
        21/3/2021 🡪 hợp lệ.
        29/2/2021 🡪 không hợp lệ.
        29/2/2020 🡪 hợp lệ.
        30/12/2019 🡪 hợp lệ.
        Tính toán ngày sau đó 1 ngày.
        Tính toán ngày trước đó 1 ngày.
*/
public class Bai18CheckNgayThangValid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập ngày");
        int day = scanner.nextInt();

        System.out.println("Nhập tháng");
        int month = scanner.nextInt();

        System.out.println("Nhập năm");
        int year = scanner.nextInt();

        scanner.close();

        boolean isValid = checkDayMonthYear(day, month, year);
        if (isValid) {
            System.out.println("Hợp lệ");
            nextDay(day,month,year);
            preDay(day,month,year);
        } else {
            System.out.println("KO hợp lệ");
        }
    }

    public static boolean checkDayMonthYear(int day, int month, int year) {
        if (year <= 0) {
            return false;
        }

        switch (month) {
            case 2:

                if (day < 1) {
                    return false;
                } else {
                    boolean namNhuan = checkYear(year);
                    if (namNhuan && day > 29) {
                        return false;
                    } else if (!namNhuan && day > 28) {
                        return false;
                    }
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day < 1 || day > 31) {
                    return false;
                }
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                if (day < 1 || day > 30) {
                    return false;
                }
                break;
            default:
                return false;

        }
        return true;
    }

    public static boolean checkYear(int year) {
        boolean namNhuan = (year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0);
        return namNhuan;
    }
    public static void nextDay(int day, int month, int year)
    {
        int day1 = day + 1;

        try {
            DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String dateString = day1 + "/" + month + "/" + year;
            Date dateObject = sdf.parse(dateString);

            System.out.println("Ngày kế tiếp là:" + sdf.format(dateObject) );

        } catch (Exception ex){

        }

    }
    public static void preDay(int day, int month, int year)
    {
        int day1 = day - 1;
        try {
            DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String dateString = day1 + "/" + month + "/" + year;
            Date dateObject = sdf.parse(dateString);

            System.out.println("Ngày trước đó là:" + sdf.format(dateObject) );

        } catch (Exception ex){

        }

    }


}
