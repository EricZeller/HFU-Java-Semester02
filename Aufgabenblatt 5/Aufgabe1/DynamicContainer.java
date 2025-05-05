import java.util.Arrays;

public class DynamicContainer implements Container {
    private int size = 0;
    private int[] numbers;

    DynamicContainer(int pSize) {
        numbers = new int[pSize];
    }

    public int size() {
        return size;
    }

    public boolean add(int number) {
        ensureCapacity();
        numbers[size] = number;
        size++;
        return true;
    }

    public boolean remove(int number) {
        for (int i = 0; i < size; i++) {
            if (numbers[i] == number) {
                numbers[i] = numbers[size - 1];
                size--;
                shrinkCapacityIfNeeded();
                return true;
            }
        }
        return false;
    }

    public boolean contains(int number) {
        for (int i = 0; i < size; i++) {
            if (number == numbers[i]) {
                return true;
            }
        }
        return false;
    }

    private void ensureCapacity() {
        if (size < numbers.length)
            return;
        int newLength = 2 * numbers.length;
        numbers = Arrays.copyOf(numbers, newLength);
    }

    private void shrinkCapacityIfNeeded() {
        if (size <= numbers.length / 2 && numbers.length > 1) { 
            int newLength = numbers.length / 2;
            if (newLength>0) {
                numbers = Arrays.copyOf(numbers, newLength);
            }
        }
    }

}