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
    }

    public boolean add (char newChar){
        if (newChar != Character.toUpperCase(newChar)) return false;
        
        if (index(newChar)) return false;

        characters[size] = newChar;
        for(int i=size; i>=1; i--) {
            if(Character.compare(characters[i-1], characters[i])>0){
                swap(i, i-1);
            }
        }
        size++;
        return true;
    }

    public boolean contains (char toProve) {
        if (index(toProve)) return true;
        else return false;
    }
    
    private boolean index(char character) {
        for(int i=0; i<size; i++){
            if (character==characters[i]) return true;
        }
        return false;
    }

    public int size (){
        return this.size;
    }

    private void swap(int i, int j) {
        char oldChar = characters[i];
        characters[i] = characters[j];
        characters[j] = oldChar;
    }
}
