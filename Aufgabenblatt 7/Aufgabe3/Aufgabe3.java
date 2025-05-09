public class Aufgabe3 {
    public static void main(String[] args) {
        Fraction half = new Fraction(2, 4);
        Fraction threeFourth = new Fraction(3, 4);
        Fraction one = new Fraction(4, -4);
        Fraction third = new Fraction(-1, -3);
        Fraction twoThirds = new Fraction(2, 3);
        Fraction[] fractions = { half, one, threeFourth, third, twoThirds };
        InsertSorter<Fraction> sorter = new InsertSorter<>();
        sorter.sort(fractions);
        for (int i = 0; i < fractions.length; i++) {
            System.out.println(fractions[i]);
        }
    }
}
