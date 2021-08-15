/*Nhập 1 số nguyên dương n (n>0). Hãy cho biết
* a. Có phải là số đối xứng? Ví dụ: 121, 12321, …
 b. Có phải là số chính phương? Ví dụ: 4, 9, 16, …
 c. Có phải là số nguyên tố? Ví dụ: 2, 3, 5, 7, …
 d. Chữ số lớn nhất và nhỏ nhất?
 e. Các chữ số có tăng dần hay giảm dần không*/


import java.util.Scanner;

public class Bai19SoDoiXung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào 1 dãy số cần kiềm tra:");
        int n = scanner.nextInt();

        //Check đối xứng
        boolean doiXung = checkDoiXung(n);
        if (doiXung == true) {
            System.out.println("Đây là số đối xứng:");
        } else {
            System.out.println("Đây không là số đối xứng:");
        }


        //check số chính phương hay ko
        int chinhPhuong = checkChinhPhuong(n);
        System.out.println("Căn bậc hai:" + chinhPhuong);

        //check số nguyên tố
        boolean nguyenTo = checkNguyenTo(n);
        if (nguyenTo == true) {
            System.out.println("Đây là số nguyên tố");
        } else {
            System.out.println("Đây KO là số nguyên tố");
        }

    }


    public static boolean checkDoiXung(int n) {
        String input = String.valueOf(n);
        int length = input.length();

        String revert = "";

        for (int i = length - 1; i >= 0; i--) {
            revert = revert + input.charAt(i);

        }

        boolean doiXung = input.equals(revert);
        return doiXung;

    }

    public static int checkChinhPhuong(int n) {

        Double tam = Math.sqrt(n);
        int chinhPhuong = tam.intValue();

        if (chinhPhuong * chinhPhuong == n) {
            System.out.println("Đây là số chính phương");
        } else {
            System.out.println("Đây không là số chính phương");
        }
        return chinhPhuong;

    }

    public static boolean checkNguyenTo(int n) {

        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;

    }

}
