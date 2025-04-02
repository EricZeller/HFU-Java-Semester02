public class Aufgabe3 {
    public static void main(String[] args) {
        Characters characters = new Characters(10);
        characters.add('H');
        characters.add('F');
        characters.add('u');
        System.out.println(characters.contains('F'));
        System.out.println(characters.contains('u'));
        System.out.println(characters.contains('X'));
    }
}

class Characters {

    char[] characters;
    int size = 0;

    Characters(int capacity) {
        characters = new char[capacity];
        System.out.println(characters);
    }

    boolean add (char newChar){
        if (newChar != Character.toUpperCase(newChar)) {
            return false;
        }
        characters[size] = newChar;
        size++;
        return true;
    }

    boolean contains (char toProve) {
        for(int i=0; i<size; i++){
            if (toProve==characters[i]) return true;
        }
        return false;
    }
}
