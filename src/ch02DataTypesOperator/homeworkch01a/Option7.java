package ch02DataTypesOperator.homeworkch01a;
//7.  Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них

import java.util.Arrays; // Для работы с массивами
import java.util.Date; // Для работы с датой и временем
import java.text.SimpleDateFormat; // Для форматирования даты и времени
import java.util.Scanner; // Для считывания ввода с консоли

public class Option7 {
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

        // Переменная для хранения числа, состоящего только из различных цифр
        int uniqueDigitNumber = -1;

        // Проходим по всем числам в массиве
        for (int number : sourceNumbers) {
            // Преобразуем число в строку и убираем знак, если он есть
            String numberStr = String.valueOf(Math.abs(number));

            // Массив для отслеживания цифр
            boolean[] digitsSeen = new boolean[10];
            boolean allUnique = true; // Предполагаем, что все цифры уникальны

            // Проверяем каждую цифру в числе
            for (char digitChar : numberStr.toCharArray()) {
                int digit = digitChar - '0'; // Преобразуем символ в цифру
                if (digitsSeen[digit]) {
                    allUnique = false; // Если цифра уже встречалась, устанавливаем флаг в false
                    break; // Прерываем цикл, так как нашли повторяющуюся цифру
                }
                digitsSeen[digit] = true; // Отмечаем цифру как встречавшуюся
            }

            // Если все цифры уникальны, сохраняем число и прекращаем поиск
            if (allUnique) {
                uniqueDigitNumber = number;
                break;
            }
        }

        // Выводим результат
        if (uniqueDigitNumber != -1) {
            System.out.println("Число, состоящее только из различных цифр: " + uniqueDigitNumber);
        } else {
            System.out.println("Нет числа, состоящего только из различных цифр.");
        }

        // Сохраняем текущую дату и время сдачи задания
        Date assignmentSubmittedDate = new Date();

        // Форматируем даты и выводим их
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Разработчик: Иванов Иван Иванович");
        System.out.println("Дата и время получения задания: " + dateFormat.format(assignmentReceivedDate));
        System.out.println("Дата и время сдачи задания: " + dateFormat.format(assignmentSubmittedDate));
    }
}

/*

*/