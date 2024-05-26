package ch01_IntroOOP.consoleinputoutput;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {
        System.out.println("Enter name and press <Enter> & number and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("hello, " + name);
        int num = scan.nextInt();
        System.out.println("number= " + num);
        scan.close();
    }
}

/*
В результате запуска приложения будет выведено, например, следующее:
Enter name and press <Enter> & number and press <Enter>:
ostap
hello, ostap
777
number= 777
Класс Scanner объявляет ряд методов для ввода: next(), nextLine(), nextInt(),
nextDouble() и др.
Позже будут рассмотрены более удобные способы извлечения информации из потока ввода с помощью класса Scanner, в качестве которого может
фигурировать не только консоль, но и дисковый файл, строка, сокетное соединение и пр.
 */