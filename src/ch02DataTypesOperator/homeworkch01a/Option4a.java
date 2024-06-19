package ch02DataTypesOperator.homeworkch01a;
// 4. Найти число, в котором число различных цифр минимально. Если таких
//чисел несколько, найти первое из них.

import java.util.Arrays; // Для работы с массивами
import java.util.Date; // Для работы с датой и временем
import java.text.SimpleDateFormat; // Для форматирования даты и времени
import java.util.Scanner; // Для считывания ввода с консоли

public class Option4a {
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

        // Инициализируем переменные для хранения результата
        int minUniqueDigitsCount = Integer.MAX_VALUE; // Минимальное количество различных цифр (начальное значение - максимально возможное)
        int numberWithMinUniqueDigits = sourceNumbers[0]; // Число с минимальным количеством различных цифр (начальное значение - первый элемент массива)

        // Проходим по всем числам в массиве
        for (int number : sourceNumbers) {
            // Преобразуем число в строку и убираем знак, если он есть
            String numberStr = String.valueOf(Math.abs(number));

            // Создаем массив для учета встреченных цифр (10 элементов, по одному на каждую цифру от 0 до 9)
            boolean[] digitsSeen = new boolean[10];
            int uniqueDigitsCount = 0; // Счетчик уникальных цифр в текущем числе

            // Проходим по всем символам строки (цифрам числа)
            for (char digitChar : numberStr.toCharArray()) {
                int digit = digitChar - '0'; // Преобразуем символ в цифру (например, '3' -> 3)

                // Если цифра еще не встречалась в текущем числе, учитываем ее
                if (!digitsSeen[digit]) {
                    digitsSeen[digit] = true; // Отмечаем цифру как встреченную
                    uniqueDigitsCount++; // Увеличиваем счетчик уникальных цифр
                }
            }

            // Если текущее количество уникальных цифр меньше найденного минимального, обновляем значения
            if (uniqueDigitsCount < minUniqueDigitsCount) {
                minUniqueDigitsCount = uniqueDigitsCount; // Обновляем минимальное количество уникальных цифр
                numberWithMinUniqueDigits = number; // Обновляем число с минимальным количеством уникальных цифр
            }
        }

        // Выводим число с минимальным количеством различных цифр
        System.out.println("Число с минимальным количеством различных цифр: " + numberWithMinUniqueDigits);

        // Сохраняем текущую дату и время сдачи задания
        Date assignmentSubmittedDate = new Date();

        // Форматируем даты и выводим их
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Разработчик: Иванов Иван Иванович");
        System.out.println("Дата и время получения задания: " + dateFormat.format(assignmentReceivedDate));
        System.out.println("Дата и время сдачи задания: " + dateFormat.format(assignmentSubmittedDate));
    }
}
