package laba7.Example3;

//на основе суперкласса создается подкласс
public class SecondSubClass extends FirstSupClass{
    SecondSubClass(int int1) {
        super(int1);
    }
    //Во втором классе появляется открытое символьное поле
    public char char1;
    //метод с двумя параметрами для присваивания значения полям (перегрузка метода из суперкласса)
    public void setInt1Str1(int int1, char char1) {
        super.int1 = int1;
        this.char1 = char1;
    }
    //конструктор с двумя параметрами
    SecondSubClass(int int1, char char1) {
        super(int1);
        this.setInt1Str1(int1, char1);
    }


    public String toString() {
        String SecondFieldValue =
                "\n str 1 = " + this.getChar1();
        return super.toString()+SecondFieldValue;
    }
    public char getChar1() {
        return char1;
    }
}
