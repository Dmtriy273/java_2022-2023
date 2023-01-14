package laba7.Example1;

public class superClassTest {
    //приватное текстовое поле
    private String str1;

    //конструктор с текстовым аргументом
    superClassTest(String strEx) {
        this.str1 = strEx;
    }

    superClassTest() {
        this.str1 = "нет параметров";
    }

    //@Override - аннотация указываемая для того, чтобы показать что далее мы собираемся переопределять метод суперкласса
    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "super" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " str 1 = " + this.getStr1();
        return superClassNameAndFieldValue;
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }
}
