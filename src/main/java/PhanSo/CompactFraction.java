package PhanSo;

public class CompactFraction {
    private InputOutputFraction fraction;

    public CompactFraction(InputOutputFraction fractionInput) {
        this.fraction = fractionInput;
    }

    public InputOutputFraction getFraction() {
        return fraction;
    }

    public float findCompact(float a, float b)
    {
        while(a!=b)
        {
            if(a > b)
            {
                a = a - b;
            }
            else
            {
                b = b - a;
            }
        }
        return a;
    }


    public void compact() {
        float a = this.fraction.getNumerator();
        float b = this.fraction.getDenominator();
        float i = findCompact(a, b);

        this.fraction.setNumerator(a/i);
        this.fraction.setDenominator(b/i);

    }
}
