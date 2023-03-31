package laba9.folder1;

public class example_1 {
    public static void main(String[] args) {
        try {
            System.out.println("1"); //1. печатает "1"
            throw new RuntimeException("Ошибка!");
        } catch (RuntimeException e) {
            System.out.println("2"+ e); //2. исключение перехвачено обработано, печатает "2" и исключение
        }
        System.out.println("3"); //3.печатает "0"
    }
}

