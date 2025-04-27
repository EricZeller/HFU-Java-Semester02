public class Aufgabe1 {
    public static void main(String[] args) {
        DynamicContainer dynamic = new DynamicContainer(10);
        for(int i=0; i<50; i++){
            dynamic.add(i);
        }
        for(int i=0; i<50; i++){
            dynamic.remove(i);
            //System.out.println(dynamic.getArrayLength()); // zur Ausgabe statt debuggen: wird immer jeweils halbiert von 80 auf 40 auf 20 usw
        }
    }
}

