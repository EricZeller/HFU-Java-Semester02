public class MyString {
    String text;
    public MyString(String pText){
        this.text = pText;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (other == null)
            return false;
        if (this.getClass() != other.getClass())
            return false;
        MyString otherString = (MyString) other;
        return this.text == otherString.text;
    }

    @Override
    public int hashCode() {
        return this.text.length();
    }
}
