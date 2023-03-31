package laba9.folder1;

public class exemple_6 {
        public static void main(String[] args) {
            try {
                System.out.println("0"); //1. печатает "0"
                throw new NullPointerException("Ошибка!");
            }
            catch (ArithmeticException e) { System.out.println("1 "+e ); } //эта часть кода пропускается
            catch (RuntimeException e) { System.out.println("3 "+e );} //2. исключение перехвачено и обработано, печатает "3" и исключение
            catch (Exception e) { System.out.println("2 "+e ); } //эта часть кода пропускается, т.к. исключение уже обработано
            System.out.println("4"); //3. печатает "4"
        }
    }
