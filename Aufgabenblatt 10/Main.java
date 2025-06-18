public class Main {
    public static void main(String[] args) {
        //aufgabe 1
        System.out.println("Aufgabe 1");
        System.out.println("Baum 1:");
        Tree<Integer> tree1 = new Tree<>();
        tree1.add(5);
        tree1.add(3);
        tree1.add(2);
        tree1.add(1);
        tree1.add(4);
        tree1.add(7);
        tree1.add(6);
        tree1.printTree();
        System.out.println();

        System.out.println("Baum 2:");
        Tree<Integer> tree2 = new Tree<>();
        tree2.add(3);
        tree2.add(1);
        tree2.add(2);
        tree2.add(5);
        tree2.add(4);
        tree2.add(6);
        tree2.add(7);
        tree2.printTree();
        System.out.println();

        // Aufgabe 2
        System.out.println("Aufgabe 2");
        // a
        System.out.println("Tiefe Baum 1: " + tree1.depth());
        System.out.println("Tiefe Baum 2: " + tree2.depth());

        // b
        Tree<Integer> emptyTree = new Tree<>();
        System.out.println("Tiefe leerer Baum: " + emptyTree.depth());

        // c
        System.out.println("Baum der zur verketteten Liste degeneriert ist:");
        Tree<Integer> listTree = new Tree<>();
        for (int i = 0; i < 8; i++) {
            listTree.add(i);
        }
        listTree.printTree();
        System.out.println("Tiefe: " + listTree.depth());
        System.out.println();

        // aufgabe 3
        System.out.println("Aufgabe 3");
        System.out.println("Baum 1 min: " + tree1.min() + ", max: " + tree1.max());
        System.out.println("Baum 1 min: " + tree2.min() + ", max: " + tree2.max());
        System.out.println("Baum 1 min: " + emptyTree.min() + ", max: " + emptyTree.max());
        System.out.println("Baum 1 min: " + listTree.min() + ", max: " + listTree.max());

    }
}