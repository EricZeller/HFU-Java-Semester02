class Aufgabe2 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.plus(2, 2));
        System.out.println(calc.minus(2, 2));
        System.out.println(calc.times(2, 2));
        System.out.println(calc.divide(2, 2));
    }    
}

class Calculator {
    float plus(float x, float y){
        return x + y;
    }

    float minus(float x, float y){
        return x - y;
    }

    float times(float x, float y){
        return x * y;
    }

    float divide(float x, float y){
        return x / y;
    }
}
