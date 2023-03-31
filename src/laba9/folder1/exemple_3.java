package laba9.folder1;

public class exemple_3 {

        public static void main(String[] args) {
            try {
                System.out.println("1"); //1. печатает "1"
                throw new RuntimeException("Ошибка!");
            }
            catch (NullPointerException e) {
                System.out.println("1 "+e ); //эта часть кода пропускается
            }
            catch (RuntimeException e) {
                System.out.println("2 "+e);  //2. исключение перехвачено обработано, печатает "2" и исключение
            }
            catch (Exception e) {
                System.out.println("3 "+e ); //эта часть кода пропускается по т.к. исключение уже обработано
            }
            System.out.println("4"); //3. печатает "0"
        }
}
