/*In der Vorlesung haben Sie die Klasse Fraction kennengelernt. Es wurde darauf hingewiesen, dass die
Implementierung der Methoden setNumerator und getDenominator nicht ganz einfach ist. Implementieren Sie
beide Methoden redundanzarm und unter Beachtung der Kapselung. Prüfen Sie Ihre Klasse ergreifen Sie
Maßnahmen, um Redundanzen zu vermeiden? */

public class Aufgabe1 {
    public static void main(String[] args) {
        Fraction fraction = new Fraction(2, 8);
        fraction.setNumerator(4);
        fraction.setDenominator(8);
        System.out.println(fraction);
        System.out.println(fraction.getNumerator());
        System.out.println(fraction.getDenominator());
    }
}

class Fraction {
    private int numerator, denominator;

    public Fraction(int numerator, int denominator) {
        int gcd = gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = numerator / gcd;
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

    public void setNumerator (int numerator) {
        int gcd = gcd(numerator, this.denominator);
        this.numerator = numerator / gcd;
        this.denominator = this.denominator / gcd;
    }

    public void setDenominator (int denominator) {
        int gcd = gcd(this.numerator, denominator);
        this.numerator = this.numerator / gcd;
        this.denominator = denominator / gcd;
    }

}