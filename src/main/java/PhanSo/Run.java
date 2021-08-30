package PhanSo;

import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //PHÂN SỐ 1
        System.out.println("PHÂN SỐ 1");
        System.out.print("Nhập tử số: ");
        float tuSo1 = scanner.nextFloat();

        System.out.print("Nhập mẫu số: ");
        float mauSo1 = scanner.nextFloat();

        InputOutputFraction frt1 = new InputOutputFraction(tuSo1, mauSo1);
        System.out.print("Tử số / Mẫu số là: ");
        frt1.print();

        float result1 = frt1.fraction();
        System.out.println("Kết quả là: " + result1);


        /*InputOutputFraction frt2 = new InputOutputFraction();
        frt2.setNumerator(tuSo);
        frt2.setDenominator(mauSo);
        float result1 = frt2.fraction();
        System.out.println("Kết quả rút gọn là: " + result1);*/

        CompactFraction cpt1 = new CompactFraction(frt1);
        cpt1.compact();
        InputOutputFraction frtCpt1 = cpt1.getFraction();
        System.out.format("Kết quả rút gọn của phân số 1 là: %.0f/%.0f", frtCpt1.getNumerator(), frtCpt1.getDenominator());
        System.out.println();

        ///PHÂN SỐ 2

        System.out.println("PHÂN SỐ 2 ");
        System.out.print("Nhập tử số: ");
        float tuSo2 = scanner.nextFloat();

        System.out.print("Nhập mẫu số: ");
        float mauSo2 = scanner.nextFloat();

        InputOutputFraction frt2 = new InputOutputFraction(tuSo2, mauSo2);
        System.out.print("Tử số / Mẫu số là: ");
        frt2.print();

        float result2 = frt2.fraction();
        System.out.println("Kết quả là: " + result2);


        /*InputOutputFraction frt2 = new InputOutputFraction();
        frt2.setNumerator(tuSo);
        frt2.setDenominator(mauSo);
        float result1 = frt2.fraction();
        System.out.println("Kết quả rút gọn là: " + result1);*/

        //gọi hàm rút gọn hai phân số
        CompactFraction cpt2 = new CompactFraction(frt2);
        cpt2.compact();
        InputOutputFraction frtCpt2 = cpt2.getFraction();
        System.out.print("Kết quả rút gọn là: ");
        frtCpt2.print();
        System.out.println();

        // gọi hàm cộng hai phân số
        //InputOutputFraction sum = InputOutputFraction.sumFraction(frt1,frt2); // có static
        InputOutputFraction sum = frt1.sumFraction(frt2); //ko static
        System.out.print("SUM: ");
        sum.print();

    // gọi hàm trừ hai phân số
        InputOutputFraction subtract = frt1.substractFraction(frt2);
        System.out.print("SUBTRACT: ");
        subtract.print();


    }


}
