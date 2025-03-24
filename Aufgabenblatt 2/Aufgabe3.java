class Aufgabe3 {
    public static void main(String[] args) {
        Primes primes=new Primes();
        for (int i=0;i<6;i++) {
            int prime = primes.nextPrime();
            System.out.println(prime);
        }
    }    
}

class Primes {
    int currentPrime;
    Primes(){
        currentPrime = 1;
    }

    int nextPrime(){
        this.currentPrime++;
        for (int i = 2; i < currentPrime; i++) {
            if (currentPrime%i==0) {
                this.currentPrime++;
            }
        }
        return this.currentPrime;
    }
}
