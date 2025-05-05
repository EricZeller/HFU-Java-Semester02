public class Aufgabe2 {
    public static void main(String[] args) {
        Fraction half = new Fraction(1, 2);
        Fraction fourth = new Fraction(1, 4);
        Fraction third = new Fraction(1, 3);
        Fraction otherHalf = new Fraction(-2, -4);
        LinkedList<Fraction> fractions = new LinkedList<>();
        fractions.add(third);
        fractions.add(half);
        fractions.add(fourth);
        System.out.println(fractions.contains(half));
        System.out.println(fractions.contains(otherHalf));
        System.out.println(fractions.remove(otherHalf));
        System.out.println(fractions.contains(otherHalf));
    }
}
