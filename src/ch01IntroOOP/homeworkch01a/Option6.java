package ch01IntroOOP.homeworkch01a;

/*Вывести фамилию разработчика, дату и время получения задания, а также
дату и время сдачи задания.*/

import java.util.Date;
import java.util.Scanner;

public class Option6 {
    public static void main(String[] args) {
        Date date1 = new Date();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя разработчика: ");
        String name = scanner.nextLine();
        System.out.println("Имя разработчика - " + name +" Получил задание "+ date1);
        System.out.println("Разработчик выполнил задание? Если да, то введите слово да");
        String result = scanner.nextLine();
        if (result.equals("да")){
            Date date2 = new Date();
            System.out.println("Разработчик - " + name +" сдал задание "+ date2);
        } else {
            System.out.println("Вы ввели неверное значение");
        }
        System.out.println();
    }
}
