import java.util.Arrays;

public class Aufgabe3 {
    static <E extends Comparable<E>> void join(Queue<E> result, Queue<E> queue1, Queue<E> queue2) {
        if (queue1.isEmpty() && queue2.isEmpty()) { // Basisfall
            return;
        }
        // Ein Element aus queue1 nehmen, wenn queue2 leer ist oder das erste Element von queue1 kleiner ist
        if (!queue1.isEmpty() && (queue2.isEmpty() || queue1.top().compareTo(queue2.top()) <= 0)) {
            result.put(queue1.get());
        }
        // Sonst ein Element aus queue2 nehmen
        else if (!queue2.isEmpty()) {
            result.put(queue2.get());
        }

        // Rekursiver Aufruf mit den verbleibenden Queues
        join(result, queue1, queue2);
    }

    public static void main(String[] args) {
        // Testfall i: Beide Queues leer
        testJoin(new Integer[] {}, new Integer[] {});

        // Testfall ii: Nur queue1 leer
        testJoin(new Integer[] {}, new Integer[] { 2, 5, 8 });

        // Testfall iii: Nur queue2 leer
        testJoin(new Integer[] { 1, 3, 6 }, new Integer[] {});

        // Testfall iv: Beide Queues nicht leer
        testJoin(new Integer[] { 1, 4, 7, 9, 16 }, new Integer[] { 0, 8, 15, 42 });
    }

    private static void testJoin(Integer[] arr1, Integer[] arr2) {
        Queue<Integer> queue1 = new WrapperQueue<>(arr1, 0, arr1.length);
        Queue<Integer> queue2 = new WrapperQueue<>(arr2, 0, arr2.length);
        Queue<Integer> result = new WrapperQueue<>(new Integer[arr1.length + arr2.length]);

        join(result, queue1, queue2);

        System.out.print("Test: queue1=" + Arrays.toString(arr1) + ", queue2=" + Arrays.toString(arr2) + ", result=");
        while (!result.isEmpty()) {
            System.out.print(result.get() + " ");
        }
        System.out.println();
    }
}
