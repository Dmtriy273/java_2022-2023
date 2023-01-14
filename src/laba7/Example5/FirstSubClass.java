package laba7.Example5;

//на основе суперкласса создается подкласс
public class FirstSubClass extends FirstSupClass {

    //защищенное целочисленное поле
    protected int int1;

    public void setInt1(int int1) {
        this.int1 = int1;
    }
    //конструктор с двумя параметрами
    FirstSubClass(String str1, int int1) {
        super(str1);
        this.setInt1(int1);
    }

    //переопределен метод для отображения значений полей объекта и названия класса
    @Override
    public void PrintToString() {
        String SecondFieldValue =
                " int1 = \"" + this.getInt1()+"\"";
        super.PrintToString();
        System.out.println(SecondFieldValue);
    }
    public int getInt1() {
        return int1;
    }
}
