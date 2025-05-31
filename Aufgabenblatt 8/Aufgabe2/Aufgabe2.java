import java.util.Random;

public class Aufgabe2 {
    private static void testSpeed(Sorter<Integer> sorter) {
        final int size = 50_000;
        // a
        Integer[] randomArray = randomArray(size);
        long timeRandom = measureSortingTime(sorter, randomArray);
        // b
        Integer[] sortedArray = sortedArray(size);
        long timeSorted = measureSortingTime(sorter, sortedArray);
        // c
        Integer[] equalArray = equalArray(size, 4_211);
        long timeEqual = measureSortingTime(sorter, equalArray);
        // ausgabe
        System.out.println(sorter.getClass() + " Runtimes: Random Values=" + timeRandom + "ms, Sorted Values=" + timeSorted
                + "ms, Equal Values=" + timeEqual + "ms, Arraylength: " + size);
        System.out.println();
    }

    private static Integer[] randomArray(int size) {
        Integer[] array = new Integer[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(); // Erzeugt eine zufällige Ganzzahl
        }
        return array;
    }

    private static Integer[] sortedArray(int size) {
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        return array;
    }

    private static Integer[] equalArray(int size, int value) {
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = value;
        }
        return array;
    }

    private static long measureSortingTime(Sorter<Integer> sorter, Integer[] array) {
        long startTime = System.currentTimeMillis();
        sorter.sort(array);
        return System.currentTimeMillis() - startTime;
    }

    public static void main(String[] args) {
        Sorter<Integer> bubblesorter = new BubbleSorter<>();
        testSpeed(bubblesorter);

        Sorter<Integer> fastbubblesorter = new FastBubbleSorter<>();
        testSpeed(fastbubblesorter);

        Sorter<Integer> javasorter = new JavaSorter<>();
        testSpeed(javasorter);
    }
}
