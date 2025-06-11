public class Aufgabe2 {
    public static void main(String[] args) {
        HashTable<Integer> numbers = new HashTable<>();
        for (int i = 0; i < 10; i += 2) {
            numbers.add(i);
        }
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
