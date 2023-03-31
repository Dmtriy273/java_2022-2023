package laba9.folder1;

public class exemple_2 {

        public static void main(String[] args) {
            try {
                System.out.println("1"); //1. печатает "1"
                throw new RuntimeException("Ошибка!");
                //System.out.println("1"); - эта часть кода не выполняется
            }
            catch (Exception e) {
                System.out.println("3"+ e ); //2. исключение перехвачено обработано, печатает "3" и исключение
            }
            System.out.println("4"); //3. печатает "0"
        }
}
