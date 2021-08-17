/*Given a string s, write a program that accepts s from the user and prints uppercase characters in s on the screen.*/

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class baitapChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập 1 chuỗi ký tự:");
        String s = scanner.nextLine();
        System.out.println("***************************************");

        printUppercase(s);
        printNonNumeric(s);

        System.out.println("Nhập 1 ký tự bạn muốn tìm là: ");
        String cStr = scanner.nextLine();
        char c = cStr.charAt(0);

        int count = occurrences(s, c);
        System.out.println("Số lần xuất hiện của ký tự đó là : " + count);

        int countWord = countWord(s);
        System.out.println("Số từ bạn đã nhập vào là: " + countWord);

        countChar(s);

        scanner.close();
    }

    public static void printUppercase(String s) {
        // ASCII value of uppercase alphabets – 65 to 90
        System.out.print("Upper case là: ");

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
        System.out.print("Non Numeric là: ");

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

    // bài 4
    public static int countWord(String s) {
        s = s.trim();
        while (s.indexOf("  ") >= 0) {
            s = s.replaceAll("  ", " ");
        }

        String[] s1 = s.split(" ");
        return s1.length;

    }

    // bài 7
    public static void countChar(String s) {
        int countNguyen = 0;
        int countPhu = 0;
        String[] arry = {"a", "e", "i", "o", "u"};

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            s = s.toLowerCase();

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

                countNguyen++;

            }

            else if (c>='b' && c <= 'z')
            {
               countPhu++;

            }

        }
        System.out.println("Số từ nguyên âm là: " + countNguyen);
        System.out.println("Số từ phụ âm là: " + countPhu);
    }
}
