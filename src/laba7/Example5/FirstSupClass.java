package laba7.Example5;

public class FirstSupClass {
    //суперкласс с защищенным текстовым полем
    protected String str1;

    public void setStr1(String str1) {
        this.str1 = str1;
    }
    //конструктор с текстовым параметром
    FirstSupClass(String str1){
        this.setStr1(str1);
    }
    //метод, при вызове которого в консольном окне отображается название класса и значение поля
    public void PrintToString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue =
                "\n Class name: " + this.getClass().getSimpleName() + "\n" +
                        " String 1 = \"" + this.getStr1()+"\"";
        System.out.println(ClassNameAndFieldValue);
    }
    public String getStr1() {
        return str1;
    }
}
