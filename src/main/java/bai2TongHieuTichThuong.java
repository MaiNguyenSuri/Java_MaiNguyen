/*Nhập hia số a và b, tính tổng, hiệu, tích, thương của hai số đó*/

import java.util.Scanner;

public class bai2TongHieuTichThuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập a:");
        int a = scanner.nextInt();

        System.out.print("Nhập b:");
        int b = scanner.nextInt();

        int sum = tinhTong(a, b);
        System.out.println("Tổng là:" + sum);

        int hieu = tinhHieu(a, b);
        System.out.println("Hiệu là:" + hieu);

        int tich = tinhTich(a, b);
        System.out.println("Tích là:" + tich);

        int thuong = tinhThuong(a, b);
        System.out.println("Thương là:" + thuong);

        scanner.close();

    }

    public static int tinhTong(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int tinhHieu(int a, int b) {
        int hieu = a - b;
        return hieu;
    }

    public static int tinhTich(int a, int b) {
        int tich = a * b;
        return tich;
    }

    public static int tinhThuong(int a, int b) {
        int thuong = a / b;
        return thuong;
    }

}
