package Aufgabe3;

public class Bill {
    private final double amount; 
    private final Currency currency;  

    public Bill(double amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public void dumpAmount(Currency other) {
        double convertedAmount = currency.convert(amount, other);
        System.out.println(convertedAmount + " " + other.getName());
    }
}
