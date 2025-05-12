//package Aufgabe1;

public class Fraction implements Comparable<Fraction> {
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

    @Override // equals wird angepasst, wird nachher in find() aufgerufen von LinkedList
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (other == null)
            return false;
        if (getClass() != other.getClass())
            return false;
        Fraction fraction = (Fraction) other;
        if (numerator != fraction.numerator)
            return false;
        return denominator == fraction.denominator;
    }

    @Override
    public String toString() {
        if (this.denominator == 1) {
            return Integer.toString(this.numerator);
        }
        return this.numerator + "/" + this.denominator;
    }

    @Override
    public int compareTo(Fraction other) {
        if (this.equals(other)) {
            return 0;
        }

        // Vergleich von Brüchen mit Kreuzmultiplikation
        int thisNumerator = (int) this.numerator * other.denominator;
        int otherNumerator = (int) other.numerator * this.denominator;

        return Integer.compare(thisNumerator, otherNumerator);
    }
}