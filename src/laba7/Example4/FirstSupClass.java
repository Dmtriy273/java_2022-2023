package laba7.Example4;

public class FirstSupClass {
    //В первом классе есть открытое символьное поле
    public char char1;

    public void setChar1(char char1) {
        this.char1 = char1;
    }
    //конструктор с одним параметром
    FirstSupClass(char char1){
        this.setChar1(char1);
    }
    //конструктор копии
    FirstSupClass(FirstSupClass copy){ this.setChar1(copy.char1); }

    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue =
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                        " char 1 = " + this.getChar1();
        return ClassNameAndFieldValue;
    }
    public char getChar1() {
        return char1;
    }
}
