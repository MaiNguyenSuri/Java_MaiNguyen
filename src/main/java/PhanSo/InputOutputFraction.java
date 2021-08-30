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


    public float fraction() {
        return numerator / denominator;
    }

    public String fractionExport() {
        String export = String.format("%.0f/%.0f", numerator, denominator);
        return export;
    }

    // hàm in ra phân số
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

    // tính tổng hai phân số
    public InputOutputFraction sumFraction(InputOutputFraction frtInput) {
        InputOutputFraction frt3 = new InputOutputFraction();

        float rsNumerator;
        float rsDenominator;
        if (this.getDenominator() == frtInput.getDenominator()) {
            rsNumerator = this.getNumerator() + frtInput.getNumerator();
            rsDenominator = this.getDenominator();
        } else {
            rsNumerator = (this.getNumerator() * frtInput.getDenominator()) + (frtInput.getNumerator() * this.getDenominator());
            rsDenominator = this.getDenominator() * frtInput.getDenominator();
        }

        frt3.setNumerator(rsNumerator);
        frt3.setDenominator(rsDenominator);

        return frt3.compact();
    }
// hàm trừ hai phân số
    public InputOutputFraction substractFraction(InputOutputFraction frtInput) {
        InputOutputFraction frt3 = new InputOutputFraction();

        float rsNumerator;
        float rsDenominator;
        if (this.getDenominator() == frtInput.getDenominator()) {
            rsNumerator = this.getNumerator() - frtInput.getNumerator();
            rsDenominator = this.getDenominator();
        } else {
            rsNumerator = (this.getNumerator() * frtInput.getDenominator()) - (frtInput.getNumerator() * this.getDenominator());
            rsDenominator = this.getDenominator() * frtInput.getDenominator();
        }

        frt3.setNumerator(rsNumerator);
        frt3.setDenominator(rsDenominator);

        return frt3.compact();
    }

}
