package laba9.folder1;

public class exemple_11 {
    public static void main(String[] args) {
        try {
            System.out.println("0"); //1. печатает "0"
            throw new NullPointerException("Ошибка!");
        }
        catch (NullPointerException e) { System.out.println("1 "+e );} //2. исключение перехвачено и обработано, печатает "1" и исключение
        finally { //т.к. finally - выполняется еще эта часть кода
            System.out.println("2" ); } //3. печатает "2"
        System.out.println("3");//4. печатает "3"
    }
}
