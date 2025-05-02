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
                result = Calculator.plus(left, right);
                break;
            case '-':
                result = Calculator.minus(left, right);
                break;
            case '*':
                result = Calculator.times(left, right);
                break;
            case '/':
                result = Calculator.divide(left, right);
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
