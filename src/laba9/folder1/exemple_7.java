package laba9.folder1;

public class exemple_7 {

        public static void main(String[] args) {
            try {
                System.out.println("0"); //1. печатает "0"
                throw new NullPointerException("Ошибка!");//исключение будет перехвачено
            } catch (NullPointerException e) {
                System.out.println("1 " + e);//2. исключение перехвачено и обработано, печатает "1" и исключение
                throw new ArithmeticException();//исключение не будет перехвачено
            } catch (ArithmeticException e) {
                System.out.println("2 " + e); //3. исключение не перехвачено, т.к. требуется новая конструкция try/catch; печатается ошибка
            }
            System.out.println("3"); //данный код не выполнен из-за ошибки
        }
}

