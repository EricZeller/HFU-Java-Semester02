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

    private char[] characters;
    private int size = 0;

    Characters(int capacity) {
        characters = new char[capacity];
    }

    public boolean add (char newChar){
        if (newChar != Character.toUpperCase(newChar)) { // dadurch wird der Datentyp char beibehalten und es kann überprüft werden ob der Character ein Großbuchstabe ist. Sonst müsste es 2x zu einem String konvertiert werden
            return false;
        }
        characters[size] = newChar;
        size++;
        return true;
    }

    public boolean contains (char toProve) {
        for(int i=0; i<size; i++){
            if (toProve==characters[i]) return true;
        }
        return false;
    }
}
