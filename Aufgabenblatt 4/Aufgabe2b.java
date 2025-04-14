public class Aufgabe2b {
    public static int fBinary(int number) {
        if (number < 0)
            return -1;

        int left = 1, right = number;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;

            if (square == number) {
                return mid;
            } else if (square < number) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    // gibt die Wurzel zurück, falls diese ganzzahlig ist. Sonst -1

    public static void main(String[] args) {
        System.out.println(fBinary(Integer.parseInt(
            System.console().readLine("Bitte Zahl eingeben von der die Wurzel gezogen werden soll: "))));
    }
}

/*
 * TBest(n) = O(1)
 * TWorst(n) = O(log(n))
 * TAvg(n) = O(log(n)/2) = O(log(n))
 */