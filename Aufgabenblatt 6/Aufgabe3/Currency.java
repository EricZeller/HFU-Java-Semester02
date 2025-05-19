
public abstract class Currency {
    public abstract String getName();

    public double convert(double amount, Currency other) {
        double amountInEUR = toEUR(amount);

        // Umrechnung von EUR in Zielwährung
        return fromEUR(amountInEUR, other);
    }

    private double toEUR(double amount) {
        if (this instanceof Euro) return amount;
        else if (this instanceof USD) return amount * 0.87;  // 1 USD = 0.87 EUR
        else if (this instanceof SFR) return amount * 1.07;  // 1 SFR = 1.07 EUR
        else return amount; 
    }

    private double fromEUR(double amountInEUR, Currency other) {
        if (other instanceof Euro) return amountInEUR;
        else if (other instanceof USD) return amountInEUR / 0.87;  // 1 EUR = 1/0.87 USD
        else if (other instanceof SFR) return amountInEUR / 1.07;  // 1 EUR = 1/1.07 SFR
        else return amountInEUR; 
    }
}