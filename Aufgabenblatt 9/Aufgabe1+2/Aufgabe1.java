public class Aufgabe1 {
    public static void main(String[] args) {
        Container<Integer> numbers = new LinkedList<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(1);
        numbers.add(1);
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}