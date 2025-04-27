public class Aufgabe1 {
    public static void main(String[] args) {
        Container dynamic = new DynamicContainer(10);
        for(int i=0; i<50; i++){
            dynamic.add(i);
        }
        for(int i=0; i<50; i++){
            dynamic.remove(i);
        }
    }
}

