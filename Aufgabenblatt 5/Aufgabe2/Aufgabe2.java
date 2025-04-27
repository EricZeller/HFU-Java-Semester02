public class Aufgabe2 {
    public static void main(String[] args) {
        // a
        LinkedList listA = new LinkedList();
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
        LinkedList listB = new LinkedList();
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
        LinkedList list = new LinkedList();
        list.add(4);
        list.add(7);
        list.add(1);
        list.add(1);
        System.out.println(list.equals(list));
        LinkedList other = new LinkedList();
        other.add(4);
        other.add(7);
        other.add(1);
        other.add(2);
        System.out.println(list.equals(other));
        System.out.println(other.equals(list));
    }

}

/* Gewünschte Ausgaben:
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
