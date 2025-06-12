import java.util.Random;

public class Aufgabe3 {
    public static void main(String[] args) {
        // a)
        System.out.println("a)");
        MyString hello = new MyString("Hello HFU");
        MyString moreHello = new MyString("Hello HFU");
        System.out.println(hello.equals(moreHello));
        System.out.println(hello.hashCode());
        System.out.println();

        // b
        System.out.println("b)");

        HashTable<String> stringTable = new HashTable<>();
        HashTable<MyString> myStringTable = new HashTable<>();
        Random random = new Random();

        for (int i = 0; i < 10_000; i++) {
            String text = random.nextInt() + "";
            stringTable.add(text);
        }

        for (int i = 0; i < 10_000; i++) {
            MyString text = new MyString(random.nextInt() + "");
            myStringTable.add(text);
        }

        long startTime = System.currentTimeMillis();
        for (String text : stringTable) {
            if (!stringTable.contains(text))
                throw new AssertionError();
        }

        long delta = System.currentTimeMillis() - startTime;
        System.out.println(delta + "ms for Type String.");
        startTime = System.currentTimeMillis();
        for (MyString text : myStringTable) {
            if (!myStringTable.contains(text))
                throw new AssertionError();
        }
        delta = System.currentTimeMillis() - startTime;
        System.out.println(delta + "ms for Type MyString.");

    }
}
