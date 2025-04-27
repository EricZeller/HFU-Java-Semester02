public class Aufgabe1 {
    public static void main(String[] args) {

        Primes primes = new Primes();
        for (int i = 0; i < 20; i++) {
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
    private int currentPrime; // nun Sichtbarkeit auf private gestellt

    Primes() {
        currentPrime = 1;
    }

    public int nextPrime() {
        this.currentPrime++;
        for (int i = 2; i < this.currentPrime ; i++) {
            if (currentPrime % i == 0) {
                this.currentPrime++;
                i=2; // i wurde nicht zurückgesetzt, sondern wurde weiter verwendet -> hier lag der Fehler, 27 und 35 werden nun nicht mehr ausgegeben
            }
        }
        return this.currentPrime;
    }
}

class Calculator {
    public static float plus(float x, float y) {
        return x + y;
    }

    public static float minus(float x, float y) {
        return x - y;
    }

    public static float times(float x, float y) {
        return x * y;
    }

    public static float divide(float x, float y) {
        return x / y;
    }
}
