
public class Aufgabe2 {
    public static void main(String[] args) {
        // a
        LinkedList<Integer> listA = new LinkedList<Integer>();
        System.out.println("Aufgabe 2a:");
        System.out.println(listA.add(4));
        System.out.println(listA.add(7));
        System.out.println(listA.add(1));
        System.out.println(listA.add(1));
        System.out.println(listA.contains(7));
        System.out.println(listA.contains(2));
        System.out.println(listA.remove(7));
        System.out.println(listA.remove(2));
        System.out.println(listA.remove(1));
        System.out.println(listA.remove(1));
        System.out.println(listA.remove(4));
        System.out.println(listA.size());

        System.out.println();


        // b
        LinkedList<Integer> listB = new LinkedList<Integer>();
        System.out.println("Aufgabe 2b:");
        System.out.println(listB.add(4));
        System.out.println(listB.add(7));
        System.out.println(listB.add(1));
        System.out.println(listB.add(1));
        listB.dumpRoundTrip();
        System.out.println();
    
        System.out.println();


        // c
        System.out.println("Aufgabe 2c:");
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(4);
        list.add(7);
        list.add(1);
        list.add(1);
        System.out.println(list.equals(list));
        LinkedList<Integer> other = new LinkedList<Integer>();
        other.add(4);
        other.add(7);
        other.add(1);
        other.add(2);
        System.out.println(list.equals(other));
        System.out.println(other.equals(list));

        //Blatt 6 zum testen mit Strings:
        LinkedList<String> listStringBlatt6 = new LinkedList<String>();
        System.out.println("Aufgabenblatt 6 Aufgabe 2:");
        System.out.println(listStringBlatt6.add("H"));
        System.out.println(listStringBlatt6.add("F"));
        System.out.println(listStringBlatt6.add("U"));
        System.out.println(listStringBlatt6.add("U"));
        System.out.println(listStringBlatt6.contains("H"));
        System.out.println(listStringBlatt6.contains("X"));
        System.out.println(listStringBlatt6.remove("H"));
        System.out.println(listStringBlatt6.remove("F"));
        System.out.println(listStringBlatt6.remove("U"));
        System.out.println(listStringBlatt6.size());

    }

}

/* Gewünschte Ausgaben: Immer noch gleich bei Blatt 6!
 * Aufgabe a:
 * true
 * true
 * true
 * true
 * true
 * false
 * true
 * false
 * true
 * true
 * true
 * 0
 * 
 * Aufgabe b:
 * 1 1 7 4 7 1 1
 * 
 * Aufgabe c:
 * true
 * false
 * false
 */
