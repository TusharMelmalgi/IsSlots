package practice.Interface;

public class BackwardString implements CharSequence {

    String string1;
    public BackwardString(String string1){
        this.string1 = string1;
    }
    @Override
    public int length() {
        return string1.length();
    }

    @Override
    public char charAt(int index) {
        if (index<0||index>string1.length())
            throw new IndexOutOfBoundsException();
        return string1.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
