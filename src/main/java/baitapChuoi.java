/*Given a string s, write a program that accepts s from the user and prints uppercase characters in s on the screen.*/

import java.util.Scanner;

public class baitapChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập 1 chuỗi ký tự:");
        String s = scanner.nextLine();


        printUppercase(s);
        printNonNumeric(s);


        System.out.print("Nhập 1 ký tự bạn muốn tìm là:");
        String cStr = scanner.nextLine();
        char c = cStr.charAt(0);

        int count = occurrences(s, c);
        System.out.println("Số lần xuất hiện: " + count);

        scanner.close();
    }

    public static void printUppercase(String s) {
        // ASCII value of uppercase alphabets – 65 to 90
        System.out.print("upper case: ");
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            int ascii = (int) c;
            if (ascii >= 65 && ascii <= 90) {
                System.out.print(c);
            }
        }
        System.out.println("");
    }

    public static void printNonNumeric(String s) {
        System.out.print("NonNumeric: ");
        // ASCII value of non numeric – 48 to 57
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            int ascii = (int) c;
            if (ascii < 48 || ascii > 57) {
                System.out.print(c);
            }
        }
        System.out.println("");
    }

    public static int occurrences(String s, char cInput) {
        int length = s.length();
        int count = 0;
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c == cInput) {
                count++;
            }
        }
        return count;
    }
}
