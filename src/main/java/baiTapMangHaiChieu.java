/*
Bài 1: Viết chương trình tìm xem ma trận kích thước m x n có chứa phần tử có giá trị x hay không
Bài 2: Cho trước ma trận a kích thước m x n. Ma trận a có phải là ma trận toàn các số nguyên tố hay không?
Bài 3: cho trước ma trận a, kích thước m x n. Tìm giá trị lớn nhất trong ma trận (gọi là max)
Bài 4:
Cho trước ma trận a, kích thước m x n. Tính tổng các phần tử trên:
a. Dòng d, cột c
b. Đường chéo chính, đường chéo phụ (ma trận vuông)
c. Nửa trên/dưới đường chéo chính (ma trận vuông)
d. Nửa trên/dưới đường chéo phụ (ma trận vuông)*/

import java.util.Scanner;

public class baiTapMangHaiChieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số cột: ");
        int c = scanner.nextInt();

        System.out.print("Nhập số dòng: ");
        int r = scanner.nextInt();

        //int[][] a = printMatrix();
        //printMatrix(a);

        //int sum = sumElements(a);
        //System.out.format("SUM = %d\n", sum);


        //int[][] a = inputMatrix(r, c);
        int[][] a = generateMatrix(r, c, 1, 10);
        printMatrix(a);

        System.out.print("Nhập x bạn muốn tìm: ");
        int x = scanner.nextInt();

        // tìm X trong mảng
        boolean findX = findX(a, x);
        if (findX) {
            System.out.format("Có %d trong mảng ", x);
        } else {
            System.out.format("Không có %d trong mảng ", x);
        }
        System.out.println();

        // Tìm max
        int max = findMax(a);
        System.out.println("Max là : " + max);

        //Tìm số nguyên tố
        checkPrimeArray(a);

        //Nhập ma trận vuông
        System.out.print("Nhập số dòng/cột cho ma trận vuông: ");
        int rc = scanner.nextInt();

        int[][] arr = generateMatrix(rc, rc, 1, 10);
        printMatrix(arr);

        //tinh tổng số dòng
        System.out.print("Nhập dòng bạn muốn tính tổng: ");
        int row = scanner.nextInt();
        int result = sumRow(arr, row);
        System.out.format("Sum dòng %d là: %d ", row, result);
        System.out.println();

        //tính tổng số cột
        System.out.print("Nhập cột bạn muốn tính tổng: ");
        int column = scanner.nextInt();
        int resultColumn = sumColum(arr, column);
        System.out.format("Sum cột %d là: %d ", column, resultColumn);
        System.out.println();

        //tính tổng đường chéo chính
        int resultPrimary = sumPrimary(arr);
        System.out.format("Sum đường chéo chính là: %d ", resultPrimary);

        //tính tổng đường chéo phụ
        int resultSecond = sumSecond(arr);
        System.out.format("Sum đường chéo phụ là: %d ", resultSecond);

        scanner.close();
    }

    // Nhập ma trận
    public static int[][] inputMatrix(int r, int c) {
        int[][] a = new int[r][c];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.format("Nhập số a[%d][%d]: ", i, j);
                a[i][j] = scanner.nextInt();
            }
        }
        return a;
    }

    // In ma trận
    public static void printMatrix(int[][] a) {
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[i].length; j < c; j++) {
                System.out.format("%5d ", a[i][j]);
            }
            System.out.println();
        }

    }

    public static int[][] generateMatrix(int r, int c, int min, int max) {
        int[][] ret = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                double random = Math.random();
                int range = max - min;
                double value = random * range + min;
                ret[i][j] = (int) Math.floor(value);
            }
        }
        return ret;
    }


    public static int sumElements(int[][] a) {
        int s = 0;
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[i].length; j < c; j++) {
                s += a[i][j];
            }
        }
        return s;
    }

    // bai 1: Viết chương trình tìm xem ma trận kích thước m x n có chứa phần tử có giá trị x hay không
    public static boolean findX(int[][] a, int x) {

        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[i].length; j < c; j++) {

                if (x == a[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }


    // bài 2: Cho trước ma trận a kích thước m x n. Ma trận a có phải là ma trận toàn các số nguyên tố hay không?
    public static boolean isPrime(int n) {
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

    public static void checkPrimeArray(int[][] a) {

        String s = "";
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[i].length; j < c; j++) {
                boolean isPrime = isPrime(a[i][j]);
                if (isPrime) {
                    s = s.concat(a[i][j] + " ");
                }

            }
        }
        System.out.println("Số nguyên tố trong mảng là: " + s);

    }

    // bài 3: cho trước ma trận a, kích thước m x n. Tìm giá trị lớn nhất trong ma trận (gọi là max)
    public static int findMax(int[][] a) {
        int max = a[0][0];
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[i].length; j < c; j++) {

                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        return max;
    }

    // bài 4 tính tổng các phần tử trên dòng d

    public static int sumRow(int[][] arr, int row) {

        int sumRow = 0;
        for (int j = 0; j < arr[row].length; j++) {
            sumRow = sumRow + arr[row][j];

        }
        return sumRow;
    }

    // bài 4 tính tổng các phần tử trên cột c
    public static int sumColum(int[][] arr, int column) {

        int sumColumn = 0;
        for (int i = 0; i < arr.length; i++) {
            sumColumn = sumColumn + arr[i][column];

        }
        return sumColumn;
    }

    //bài 4 tính tổng đường chéo chính của ma trận vuông
    public static int sumPrimary(int[][] arr) {

        int sumPrimary = 0;
        for (int i = 0; i < arr.length; i++) {
            sumPrimary = sumPrimary + arr[i][i];

        }
        return sumPrimary;
    }

    //bài 4 tính tổng đường chéo phụ của ma trận vuông
    public static int sumSecond(int[][] arr) {
        int length = arr.length;
        int sumSecond = 0;
        for (int i = 0; i < length; i++) {
            int column = length - 1 - i;
            sumSecond = sumSecond + arr[i][column];

        }
        return sumSecond;
    }
}
