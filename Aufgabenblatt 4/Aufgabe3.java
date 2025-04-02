public class Aufgabe3 {
    public static void main(String[] args) {
        CharacterSet set=new CharacterSet(26);
        set.add('H');
        set.add('F');
        set.add('U');
        set.add('u');
        set.add('F');
        System.out.println(3==set.size());
    }
}

class CharacterSet {

    private char[] characters;
    private int size = 0;

    CharacterSet(int capacity) {
        characters = new char[capacity];
        System.out.println(characters);
    }

    boolean add (char newChar){
        if (newChar != Character.toUpperCase(newChar)) return false;
        
        for (int i = 0; i < size; i++) {
            if (this.characters[i] == newChar) return false;
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

    int size (){
        return this.size;
    }
}
