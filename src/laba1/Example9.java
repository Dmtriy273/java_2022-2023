package laba1;

import java.util.Scanner;

public class Example9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


    System.out.println("Напишите месяц (большая буква)");
                String mount = in.nextLine();

                switch (mount) {

                    case "Январь" :
                    System.out.println("Январь 31 день!");
                    break;

                    case "Февраль" :
                        System.out.println("Февраль 28 дней!");
                        break;

                    case "Март" :
                        System.out.println("Март 31 день!");
                        break;

                    case "Апрель" :
                        System.out.println("Апрель 30 дней!");
                        break;

                    case "Май" :
                        System.out.println("Май 31 день!");
                        break;

                    case "Июнь" :
                        System.out.println("Июнь 30 дней!");
                        break;

                    case "Июль" :
                        System.out.println("Июль 31 день!");
                        break;

                    case "Август" :
                        System.out.println("Август 31 день!");
                        break;

                    case "Сентябрь" :
                        System.out.println("Сентябрь 30 дней!");
                        break;

                    case "Октябрь" :
                        System.out.println("Октябрь 31 день!");
                        break;

                    case "Ноябрь" :
                        System.out.println("Ноябрь 30 дней!");
                        break;

                    case "Декабрь" :
                        System.out.println("Март 31 день!");
                        break;
                }
    }
 }
