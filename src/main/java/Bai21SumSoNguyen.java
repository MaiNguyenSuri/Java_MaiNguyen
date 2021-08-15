/*Nhập 3 số nguyên a, b và n với a, b < n. Tính tổng
các số nguyên dương nhỏ hơn n chia hết cho a
nhưng không chia hết cho b
VD: a = 3, b = 4, n = 10. Kết quả sẽ là 18
i = 1
i = 2
i = 3
i = 4
i = 5
i = 6
i = 7
i = 8
i = 9

a = 3
b = 4
n = 10

Kết quả là : 3 + 6 + 9 = 18
*/

import java.util.Scanner;

public class Bai21SumSoNguyen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập a:");
        int a = scanner.nextInt();

        System.out.print("Nhập b:");

        int b = scanner.nextInt();

        System.out.print("Nhập n:");
        int n = scanner.nextInt();

        if (a < n && b < n) {

            int result = sumNguyenDuong(a, b, n);
            System.out.println("Kết quả là:" + result);
        } else {
            System.out.println("Không hợp lệ:");
        }

        scanner.close();

    }

    public static int sumNguyenDuong(int a, int b, int n) {
        int result = 0;
        for (int i = 1; i < n; i++) {
            if (i % a == 0 && i % b != 0) {
                result = result + i;
            }
        }
        return result;
    }

}
