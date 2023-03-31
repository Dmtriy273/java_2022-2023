package laba9.folder1;

public class exemple_9 {
    public static int m(){
        try {
            System.out.println("0"); //1. печатает "0"
            return 10; //2. выход из метода с присвоением значения "10"
        }
        finally { //т.к. finally - выполняется еще эта часть кода
            System.out.println("1"); } //3. печатает "1"
    }
    public static void main(String[] args) { System.out.println(m()); } //4. печатает значение метода "10"
}
