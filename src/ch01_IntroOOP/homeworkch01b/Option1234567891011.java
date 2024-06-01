package ch01_IntroOOP.homeworkch01b;
/*Вариант B
Ввести с консоли n целых чисел. На консоль вывести:
1. Четные и нечетные числа.*/

import java.util.Arrays;
import java.util.Scanner;

public class Option1234567891011 {
    public static void main(String[] args){

        //Ввод в консоль n целых чисел:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сколько целых чисел вы собираетесь ввести? ");
        int size = scanner.nextInt();
        int[] sourceNumbers = new int[size];   //Создаем массив с заданным числом ячеек
        System.out.print("Введите целые числа через пробел " + "и нажмите <Enter>: ");
        for (int i = 0; i < sourceNumbers.length; i++) {
            sourceNumbers[i] = scanner.nextInt();       //ЗАПОЛНЯЕМ МАССИВ ЗНАЧЕНИЯМИ
        }
        System.out.println("Ваш массив: " + Arrays.toString(sourceNumbers));
        System.out.println("\n");

        //ВЫВЕСТИ ЧЁТНЫЕ И НЕЧЁТНЫЕ ЧИСЛА:

        //x % 2 - вычисляет остаток от деления x на 2.
        int counter;
        int  evenNumbers;  //четные числа
        int oddNumbers;   //нечетные числа

        System.out.println("Четные числа: ");
        for (counter = 0; counter < sourceNumbers.length; counter++){
            int namber = sourceNumbers[counter];
            if(namber%2 == 0){
                evenNumbers = namber;

                System.out.print(" "+evenNumbers);
            }
        }
        System.out.println();
        System.out.println("Нечетные числа: ");
        for (counter = 0; counter < sourceNumbers.length; counter++){
            int namber = sourceNumbers[counter];
            if(namber%2 != 0){
                oddNumbers = namber;
                System.out.print(" "+oddNumbers);
            }
        }
        System.out.println("\n");

        // Наибольшее и наименьшее число

        int max = sourceNumbers[0]; // начальное значение МАКСИМАЛЬНОГО элемента
        System.out.println("НАИБОЛЬШЕЕ число: ");
        for (counter = 0; counter < sourceNumbers.length; counter++){
            int sourceX = sourceNumbers[counter];
            if(max < sourceX){
                max = sourceX;
            }
        }
        System.out.println(max);

        int min = sourceNumbers[0]; // начальное значение МАКСИМАЛЬНОГО элемента
        System.out.println("НАИМЕНЬШЕЕ число: ");
        for (counter = 0; counter < sourceNumbers.length; counter++){
            int sourceX = sourceNumbers[counter];
            if(min > sourceX){
                min = sourceX;
            }
        }
        System.out.println(min + "\n");



    }
}
