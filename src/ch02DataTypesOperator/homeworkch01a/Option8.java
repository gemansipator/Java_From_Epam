package ch02DataTypesOperator.homeworkch01a;
//8.  Среди чисел найти число-палиндром. Если таких чисел больше одного,
//найти второе.

import java.util.Arrays; // Для работы с массивами
import java.util.Date; // Для работы с датой и временем
import java.text.SimpleDateFormat; // Для форматирования даты и времени
import java.util.Scanner; // Для считывания ввода с консоли

public class Option8 {
    public static void main(String[] args) {
        // Сохраняем текущую дату и время получения задания
        Date assignmentReceivedDate = new Date();

        // Создаем объект Scanner для считывания ввода с консоли
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя количество целых чисел, которые он собирается ввести
        System.out.print("Сколько целых чисел вы собираетесь ввести? ");
        int size = scanner.nextInt();

        // Создаем массив для хранения введенных пользователем чисел
        int[] sourceNumbers = new int[size];

        // Запрашиваем у пользователя ввод целых чисел через пробел
        System.out.print("Введите целые числа через пробел и нажмите <Enter>: ");
        // Заполняем массив числами, введенными пользователем
        for (int i = 0; i < sourceNumbers.length; i++) {
            sourceNumbers[i] = scanner.nextInt();
        }

        // Выводим массив, чтобы пользователь видел, какие числа он ввел
        System.out.println("Ваш массив: " + Arrays.toString(sourceNumbers));

        // Переменные для хранения первого и второго палиндрома
        Integer firstPalindrome = null;
        Integer secondPalindrome = null;

        // Проходим по всем числам в массиве
        for (int number : sourceNumbers) {
            if (isPalindrome(number)) {
                if (firstPalindrome == null) {
                    firstPalindrome = number; // Сохраняем первый найденный палиндром
                } else if (secondPalindrome == null) {
                    secondPalindrome = number; // Сохраняем второй найденный палиндром
                    break; // Прерываем цикл, так как нашли второй палиндром
                }
            }
        }

        // Выводим результат
        if (secondPalindrome != null) {
            System.out.println("Второе число-палиндром: " + secondPalindrome);
        } else if (firstPalindrome != null) {
            System.out.println("Первое (и единственное) число-палиндром: " + firstPalindrome);
        } else {
            System.out.println("Нет чисел-палиндромов.");
        }

        // Сохраняем текущую дату и время сдачи задания
        Date assignmentSubmittedDate = new Date();

        // Форматируем даты и выводим их
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Разработчик: Иванов Иван Иванович");
        System.out.println("Дата и время получения задания: " + dateFormat.format(assignmentReceivedDate));
        System.out.println("Дата и время сдачи задания: " + dateFormat.format(assignmentSubmittedDate));
    }

    // Метод для проверки, является ли число палиндромом
    public static boolean isPalindrome(int number) {
        String str = String.valueOf(Math.abs(number)); // Преобразуем число в строку, убираем знак
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return false; // Если символы не совпадают, число не является палиндромом
            }
        }
        return true; // Если все символы совпадают, число является палиндромом
    }
}


/*
Для решения задачи по нахождению числа, состоящего только из различных цифр, и вывода первого из таких чисел, можно использовать следующий алгоритм:

Пройти по каждому числу в массиве.
Проверить, все ли цифры в числе уникальны.
Если найдено такое число, сохранить его и прекратить дальнейший поиск.
*/