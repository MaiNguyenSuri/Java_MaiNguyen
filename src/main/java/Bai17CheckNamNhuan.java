import java.util.Scanner;

/*Viết chương trình xét 1 năm có phải năm nhuận hay không?
Năm nhuận là năm chia hết cho 400 hoặc chia hết cho 4 đồng thời không chia hết cho 100.
Năm 4 🡪 năm nhuận.
Năm 92 🡪 năm nhuận.
Năm 96 🡪 năm nhuận.
Năm 100 🡪 không nhuận.
Năm 104 🡪 năm nhuận.
Năm 196 🡪 năm nhuận.
Năm 200 🡪 không nhuận.
Năm 400 🡪 năm nhuận.*/
public class Bai17CheckNamNhuan {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("NHập năm:");
        int year = scanner.nextInt();

        scanner.close();

        tinhNam(year);

    }
    public static void tinhNam(int year)
    {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0))
                {
                            System.out.println("Đây là năm nhuận");
                }
                else
                {
                    System.out.println("Đây KO là năm nhuận");
                }
    }
}
