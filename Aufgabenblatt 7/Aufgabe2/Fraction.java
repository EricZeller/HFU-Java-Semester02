//package Aufgabe1;

public class Fraction {
    private int numerator, denominator;

    public Fraction(int numerator, int denominator) {
        setGeneral(numerator, denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    private int gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public void setNumerator(int numerator) {
        setGeneral(numerator, this.denominator);
    }

    public void setDenominator(int denominator) {
        setGeneral(this.numerator, denominator);
    }

    private void setGeneral(int numerator, int denominator) {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        if (denominator < 0) {
            numerator = numerator * -1;
            denominator = denominator * -1;
        }
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}