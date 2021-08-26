package PhanSo;

import java.util.Scanner;

public class InputOutputFraction {

    private float numerator; // Tu so
    private float denominator; // Mau so

    public InputOutputFraction(float numerator, float denominator) {
        this.numerator = numerator;
        if(denominator != 0) {
            this.denominator = denominator;
        }
    }

    public InputOutputFraction() {
    }

    public float fraction(){
        return numerator / denominator;
    }

    public String fractionExport(){
        String export = String.format("%.0f/%.0f", numerator, denominator);
        return export;
    }

    public float getDenominator() {
        return denominator;
    }

    public void setDenominator(float denominator) {
        if(denominator != 0) {
            this.denominator = denominator;
        }
    }

    public float getNumerator() {
        return numerator;
    }

    public void setNumerator(float numerator) {
        this.numerator = numerator;
    }
}
