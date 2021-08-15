import java.util.Scanner;

/*Nhập tên sản phẩm, số lương và đơn gia, tính tiền và thuế giá trị gia tăng phải trả
tiền = số lượng x đơn giá
thuế giá trị gia tăng = 10% tiền
 */
public class bai3TongTien {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên sản phẩm:");
        String sanPham = scanner.nextLine();

        System.out.print("Nhập số lượng:");
        int soLuong = scanner.nextInt();

        System.out.print("Nhập đơn giá:");
        int donGia = scanner.nextInt();

        double tongTien = tongTien(soLuong,donGia);
        System.out.print("Tổng tiền:" + tongTien);

        scanner.close();
    }

    public static double tongTien(int soLuong, int donGia)
    {
        double tongTien = (soLuong * donGia);
        double thue = tongTien*10/100;

        System.out.println("Thuế:" + thue);

        return tongTien;
    }

}
