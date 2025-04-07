public class Aufgabe2 {
    public static int f(int number) {
        for (int i = 1; i * i <= number; i++) {
            if (i * i == number) {
                return i;
            }
        }
        return -1;
    }
    //gibt die Wurzel zurück, falls diese ganzzahlig ist. Sonst -1

    public static void main(String[] args) {
        System.out.println(f(25));
    }
}

/*
 * TBest(n) = O(1)
 * TWorst(n) = O(sqrt(n))
 * TAvg(n) = O(sqrt(n)/2) = O(sqrt(n))
 */