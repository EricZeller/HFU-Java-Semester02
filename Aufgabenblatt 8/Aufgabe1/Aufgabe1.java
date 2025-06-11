import java.util.Random;

public class Aufgabe1 {

    private static void testSorter(Sorter<Integer> sortable) {
        // Erzeugt ein Array mit 10.000 Elementen
        Integer[] array = new Integer[10_000];
        Random random = new Random();

        // Füllt das Array mit Pseudo Zufallszahlen
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(); // Erzeugt eine zufällige Ganzzahl
        }

        // Sortiert das Array mit dem übergebenen Sorter
        sortable.sort(array);

        // Überprüfe, ob das Array sortiert ist
        boolean isSorted = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isSorted = false;
                break;
            }
        }

        // Gib das Ergebnis aus
        if (isSorted) {
            System.out.println(sortable.getClass() + ": array is sorted");
        } else {
            System.out.println(sortable.getClass() + ": array is not sorted");
        }
    }

    public static void main(String[] args) {
        Sorter<Integer> bubbleSorter = new BubbleSorter<>();
        testSorter(bubbleSorter);

        Sorter<Integer> fastbubbleSorter = new FastBubbleSorter<>();
        testSorter(fastbubbleSorter);

        Sorter<Integer> javaSorter = new JavaSorter<>();
        testSorter(javaSorter);
    }
}
