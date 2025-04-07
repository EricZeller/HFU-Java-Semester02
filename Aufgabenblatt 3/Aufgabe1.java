public class Aufgabe1 {
    public static void main(String[] args) {

        Primes primes = new Primes();
        for (int i = 0; i < 6; i++) {
            int prime = primes.nextPrime();
            System.out.println(prime);
        }

        System.out.println(Calculator.plus(2, 2));
        System.out.println(Calculator.minus(2, 2));
        System.out.println(Calculator.times(2, 2));
        System.out.println(Calculator.divide(2, 2));
    }
}

class Primes {
    private int currentPrime;

    Primes() {
        currentPrime = 1;
    }

    public int nextPrime() {
        this.currentPrime++;
        for (int i = 2; i < currentPrime; i++) {
            if (currentPrime % i == 0) {
                this.currentPrime++;
            }
        }
        return this.currentPrime;
    }
}

class Calculator {
    static float plus(float x, float y) {
        return x + y;
    }

    static float minus(float x, float y) {
        return x - y;
    }

    static float times(float x, float y) {
        return x * y;
    }

    static float divide(float x, float y) {
        return x / y;
    }
}
