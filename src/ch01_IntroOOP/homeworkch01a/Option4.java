package ch01_IntroOOP.homeworkch01a;
/*Ввести пароль из командной строки и сравнить его со строкой-образцом.*/

import java.util.Scanner;

public class Option4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "FFFee33";

        System.out.println("Введите пароль: ");

        String passwordUser = scanner.nextLine();

        if (passwordUser.equals(password)){
            System.out.println("пароль совпал");
        }else {
            System.out.println("Вы ошиблись");
        }

    }
}
