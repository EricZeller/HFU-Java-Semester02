public class Aufgabe1 {
    public static void main(String[] args) {
        Integer v = 23;
        Integer w = 23;
        System.out.println(v == w);

        Integer v2 = 1000_000;
        Integer w2 = 1000_000;
        System.out.println(v2);
        System.out.println(v2 == w2);
        while (v2!=w2) {
            v2--;
            w2--;
        }
        System.out.println(v == w);
        System.out.println(v2); // bei 127 / ab 128 wird nicht mehr gecached
    }
}
