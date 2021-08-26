package PhanSo;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tử số: ");
        float tuSo = scanner.nextFloat();

        System.out.println("Nhập mẫu số: ");
        float mauSo = scanner.nextFloat();

        InputOutputFraction frt = new InputOutputFraction(tuSo, mauSo);
        String export = frt.fractionExport();
        System.out.println("Tử số / Mẫu số là: "+ export);

        float result = frt.fraction();
        System.out.println("Kết quả là: " + result);


        /*InputOutputFraction frt2 = new InputOutputFraction();
        frt2.setNumerator(tuSo);
        frt2.setDenominator(mauSo);
        float result1 = frt2.fraction();
        System.out.println("Kết quả rút gọn là: " + result1);*/

        CompactFraction cpt = new CompactFraction(frt);
        cpt.compact();
        InputOutputFraction frtCpt = cpt.getFraction();
        System.out.format("Kết quả rút gọn là: %.0f/%.0f", frtCpt.getNumerator(), frtCpt.getDenominator());
        System.out.println();

    }
}
