/*Nhập một số nguyên dương n. Tính:
a. S = 1 + 2 + … + n (VD: i = 5, S = 15)
b. S = 12 + 22 + … + n2
c. S = 1 + 1/2 + … + 1/n
d. S = 1*2*…*n = n!
e. S = 1! + 2! + … + n!
*/

import java.util.Scanner;

public class Bai20FindS {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("NHập n:");
        int n = scanner.nextInt();


        int sa = findSa(n);
        System.out.println("Kết quả Sa là:" + sa);

        int sb = findSb(n);
        System.out.println("Kết quả Sb là:" + sb);

        float sc = findSc(n);
        System.out.println("Kết quả Sc là:" + sc);

        int sd = findSd(n);
        System.out.println("Kết quả Sd là:" + sd);

        int se = findSe(n);
        System.out.println("Kết quả Se là:" + se);

        scanner.close();
    }

    public static int findSa (int n)
    {
        int result = 0;
        for (int i = 1 ; i <= n; i++)
        {
            result = result + i;
        }
        return result;
    }

    public static int findSb (int n)
    {
        int result = 0;
        for (int i = 1 ; i <= n; i++)
        {
            int tam = Integer.parseInt(i + "2");
            result = result + tam;

        }
        return result;
    }

    public static float findSc (int n)
    {
        float result = 0f;
        for (int i = 1 ; i <= n; i++)
        {
            float tam = (float)1/i;
            result = result + tam;

        }
        return result;
    }

    public static int findSd (int n)
    {
        int result = 1;
        for (int i = 1 ; i <= n; i++)
        {
            result = result * i;
        }
        return result;
    }

    public static int findSe (int n)
    {
        int result = 0;
        for (int i = 1 ; i <= n; i++)
        {
            int tam = findSd(i);
            result = result + tam;
        }
        return result;
    }

}
