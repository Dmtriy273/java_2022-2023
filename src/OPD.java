import java.util.Scanner;

public class OPD {
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.println("Бюджет проэкта:");
    float a = in.nextInt();
    System.out.println("Запланированный срок сдачи в мес.:");
    float b = in.nextInt();
    System.out.println("Расходы на Сегодня:");
    float c = in.nextInt();

    float x = a / b;
    float z = (c * x) / 30;
    System.out.println("Задержка срока: " + z);

    float k = (z * x);
    System.out.println("Перерасход бюджета: " + k);
    }
}

