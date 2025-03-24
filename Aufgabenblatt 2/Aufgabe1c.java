class Aufgabe1c {
        public static void main(String[] args){
            float pi = 3.141F;
            float radius = Float.parseFloat(System.console().readLine());
            float area = pi*(radius*radius);
            float perimeter = (2*radius)*pi;
            System.out.println("Area: " + area);
            System.out.println("Umfang: " + perimeter);
        }
    }    
