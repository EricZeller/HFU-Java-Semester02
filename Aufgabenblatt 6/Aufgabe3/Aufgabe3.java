package Aufgabe3;

public class Aufgabe3 {
    public static void main(String[] args) {
        // 3a
        Currency eur = new Euro();
        Currency usd = new USD();
        Currency sfr = new SFR();
        System.out.println(eur.convert(100.0, eur) + " " + eur.getName());
        System.out.println(eur.convert(100.0, sfr) + " " + sfr.getName());
        System.out.println(eur.convert(100.0, usd) + " " + usd.getName());
        System.out.println(usd.convert(100, eur) + " " + eur.getName());

        /*
         * Gewünschte Ausgabe:
         * 3a:
         * 100.0 EUR
         * 93.45794392523364 SFR
         * 114.94252873563218 USD
         * 87.0 EUR
         */
    }
}