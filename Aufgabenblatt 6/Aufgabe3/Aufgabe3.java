public class Aufgabe3 {
    public static void main(String[] args) {
        // 3a
        System.out.println("Aufgabe 3a:");
        Currency eur = new Euro();
        Currency usd = new USD();
        Currency sfr = new SFR();
        System.out.println(eur.convert(100.0, eur) + " " + eur.getName());
        System.out.println(eur.convert(100.0, sfr) + " " + sfr.getName());
        System.out.println(eur.convert(100.0, usd) + " " + usd.getName());
        System.out.println(usd.convert(100, eur) + " " + eur.getName());
        System.out.println();

        // 3b
        System.out.println("Aufgabe 3b:");
        Bill bill = new Bill(100.0, usd);
        bill.dumpAmount(eur);
        bill.dumpAmount(sfr);
        bill.dumpAmount(usd);

        /*
         * Gewünschte Ausgabe:
         * 3a:
         * 100.0 EUR
         * 93.45794392523364 SFR
         * 114.94252873563218 USD
         * 87.0 EUR
         * 
         * 3b:
         * 87.0 EUR
         * 81.30841121495327 SFR
         * 100.0 USD
         */
    }
}