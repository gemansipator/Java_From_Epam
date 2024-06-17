package ch02DataTypesOperator.homeworkch01a;

import java.util.Arrays;
import java.util.Scanner;

public class Option1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Создаем объект Scanner для считывания ввода с консоли
        System.out.print("Сколько целых чисел вы собираетесь ввести? ");
        int size = scanner.nextInt();  // Считываем количество чисел, которые пользователь собирается ввести
        int[] sourceNumbers = new int[size];  // Создаем массив с количеством элементов, равным введенному пользователем

        System.out.print("Введите целые числа через пробел и нажмите <Enter>: ");
        for (int i = 0; i < sourceNumbers.length; i++) {
            sourceNumbers[i] = scanner.nextInt();  // Заполняем массив введенными пользователем числами
        }

        System.out.println("Ваш массив: " + Arrays.toString(sourceNumbers));  // Выводим массив, чтобы пользователь видел, какие числа он ввел

        // Инициализация переменных для хранения самого короткого и самого длинного числа и их длин
        int minLength = Integer.MAX_VALUE;  // Инициализируем минимальную длину максимально возможным значением
        int maxLength = Integer.MIN_VALUE;  // Инициализируем максимальную длину минимально возможным значением
        int shortestNumber = 0;  // Переменная для хранения самого короткого числа
        int longestNumber = 0;  // Переменная для хранения самого длинного числа

        // Проходим по каждому числу в массиве
        for (int number : sourceNumbers) {
            // Находим длину текущего числа. Math.abs используется для игнорирования знака числа
            int length = String.valueOf(Math.abs(number)).length();

            // Проверяем, является ли текущая длина меньше минимальной длины, найденной ранее
            if (length < minLength) {
                minLength = length;  // Обновляем минимальную длину
                shortestNumber = number;  // Сохраняем текущее число как самое короткое
            }

            // Проверяем, является ли текущая длина больше максимальной длины, найденной ранее
            if (length > maxLength) {
                maxLength = length;  // Обновляем максимальную длину
                longestNumber = number;  // Сохраняем текущее число как самое длинное
            }
        }

        // Выводим результаты
        System.out.println("Самое короткое число: " + shortestNumber + " с длиной " + minLength);  // Выводим самое короткое число и его длину
        System.out.println("Самое длинное число: " + longestNumber + " с длиной " + maxLength);  // Выводим самое длинное число и его длину
    }

}
