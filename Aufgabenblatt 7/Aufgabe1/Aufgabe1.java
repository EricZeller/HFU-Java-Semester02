//package Aufgabe1;

public class Aufgabe1 {
    public static void main(String[] args) {
        Fraction half = new Fraction(2, -4);
        System.out.println(half.getNumerator());
        System.out.println(half.getDenominator());
        half = new Fraction(-2, -4);
        System.out.println(half.getNumerator());
        System.out.println(half.getDenominator());
    }
}
