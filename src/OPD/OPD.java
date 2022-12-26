package OPD;

import java.util.Scanner;

public class OPD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double AG, AD, ID, AH, EH, GH;
        System.out.println("Плановое время завершения проекта(мес.): ");
        AG = in.nextInt();
        System.out.println("Время точки сегодня (мес.): ");
        AD = in.nextInt();
        System.out.println("Процент завершения проекта на сегодня: ");
        ID = in.nextInt();
        EH=100;
        AH=AD*EH/ID;
        GH=AH-AG;
        double AB, DF, HO, CB;
        System.out.println("Потрачено денег на сегодня:");
        DF=in.nextInt() ;
        System.out.println("Планируемый бюджет: ");
        AB=in.nextInt() ;
        HO=AH*DF/AD;
        CB=(int)Math.ceil(HO-AB);
        System.out.println("Задержка завершения проекта(в мес.) составит: " + GH);
        System.out.println("Перерасход бюджета(в у.е.): " + CB);
    }
}


