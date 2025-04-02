class Aufgabe2a {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculate(calculator, "47", '+', "11");
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
}

class Calculator {
    float plus(float x, float y) {
        return x + y;
    }

    float minus(float x, float y) {
        return x - y;
    }

    float times(float x, float y) {
        return x * y;
    }

    float divide(float x, float y) {
        return x / y;
    }
}
