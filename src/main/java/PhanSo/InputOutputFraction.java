package PhanSo;

import java.util.Scanner;

public class InputOutputFraction {

    private float numerator; // Tu so
    private float denominator; // Mau so

    public InputOutputFraction(float numerator, float denominator) {
        this.numerator = numerator;
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    public InputOutputFraction() {
    }

    public static InputOutputFraction sumFraction(InputOutputFraction frt1, InputOutputFraction frt2) {
        InputOutputFraction frt3 = new InputOutputFraction();

        float tuso;
        float mauso;
        if (frt1.getDenominator() == frt2.getDenominator()) {
            tuso = frt1.getNumerator() + frt2.getNumerator();
            mauso = frt1.getDenominator();


        } else {
            tuso = (frt1.getNumerator() * frt2.getDenominator()) + (frt2.getNumerator() * frt1.getDenominator());
            mauso = frt1.getDenominator() * frt2.getDenominator();
        }

        frt3.setNumerator(tuso);
        frt3.setDenominator(mauso);

        return frt3.compact();
    }

    public float fraction() {
        return numerator / denominator;
    }

    public String fractionExport() {
        String export = String.format("%.0f/%.0f", numerator, denominator);
        return export;
    }

    public void print() {
        String export = fractionExport();
        System.out.println(export);
    }

    public float getDenominator() {
        return denominator;
    }

    public void setDenominator(float denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    public float getNumerator() {
        return numerator;
    }

    public void setNumerator(float numerator) {
        this.numerator = numerator;
    }

    public InputOutputFraction compact() {
        CompactFraction compact = new CompactFraction(this);
        return compact.getFraction();
    }

    public InputOutputFraction sum(InputOutputFraction frtinput) {
        InputOutputFraction frt3 = sumFraction(this, frtinput);

        return frt3;
    }

}
