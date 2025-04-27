class Aufgabe2b {
    public static void main(String[] args) {
        calculate();
    }

    static void calculate(Calculator calculator, String textLeft, char operation, String textRight) {
        float left = Float.parseFloat(textLeft);
        float right = Float.parseFloat(textRight);
        float result = 0;
        switch (operation) {
            case '+':
                result = calculator.plus(left, right);
                break;
            case '-':
                result = calculator.minus(left, right);
                break;
            case '*':
                result = calculator.times(left, right);
                break;
            case '/':
                result = calculator.divide(left, right);
                break;
            default:
                System.out.println("Invalid operation");
        }
        System.out.println(result);
    }

    static void calculate() {
        while (true) {
            Calculator calculator = new Calculator();
            calculate(
                calculator, 
                System.console().readLine("Erste Zahl: "), 
                System.console().readLine("Operation: ").charAt(0), 
                System.console().readLine("Zweite Zahl: "));
        }
    }
}

class Calculator {
    public float plus(float x, float y) {
        return x + y;
    }

    public float minus(float x, float y) {
        return x - y;
    }

    public float times(float x, float y) {
        return x * y;
    }

    public float divide(float x, float y) {
        return x / y;
    }
}
