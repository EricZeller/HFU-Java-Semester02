/*In der Vorlesung haben Sie die Klasse Fraction kennengelernt. Es wurde darauf hingewiesen, dass die
Implementierung der Methoden setNumerator und getDenominator nicht ganz einfach ist. Implementieren Sie
beide Methoden redundanzarm und unter Beachtung der Kapselung. Prüfen Sie Ihre Klasse ergreifen Sie
Maßnahmen, um Redundanzen zu vermeiden? */

public class Aufgabe1 {
    public static void main(String[] args) {
        Fraction fraction = new Fraction(6, 9); // 6/9 -> 2/3
        System.out.println(fraction);
        fraction.setNumerator(6); // 2/3 -> 6/3 -> 2/1
        System.out.println(fraction);
        fraction.setDenominator(4); // 2/1 -> 2/4 -> 1/2
        System.out.println(fraction);
    }
}

class Fraction {
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
        while (a != b)
            if (a > b)
                a = a - b;
            else
                b = b - a;
        return a;
    }

    public void setNumerator(int numerator) {
        setGeneral(numerator, this.denominator);
    }

    public void setDenominator(int denominator) {
        setGeneral(this.numerator, denominator);
    }

    private void setGeneral(int numerator, int denominator) {
        int gcd = gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}