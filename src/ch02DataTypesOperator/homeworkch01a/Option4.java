package ch02DataTypesOperator.homeworkch01a;
// 4. Найти число, в котором число различных цифр минимально. Если таких
//чисел несколько, найти первое из них.

import java.util.Arrays; // Для работы с массивами
import java.util.HashSet; // Для использования HashSet
import java.util.Scanner; // Для считывания ввода с консоли
import java.util.Set; // Для использования интерфейса Set

public class Option4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создаем объект Scanner для считывания ввода с консоли
        System.out.print("Сколько целых чисел вы собираетесь ввести? ");
        int size = scanner.nextInt(); // Считываем количество чисел, которые пользователь собирается ввести
        int[] sourceNumbers = new int[size]; // Создаем массив с количеством элементов, равным введенному пользователем

        System.out.print("Введите целые числа через пробел и нажмите <Enter>: ");
        for (int i = 0; i < sourceNumbers.length; i++) {
            sourceNumbers[i] = scanner.nextInt(); // Заполняем массив введенными пользователем числами
        }

        System.out.println("Ваш массив: " + Arrays.toString(sourceNumbers)); // Выводим массив, чтобы пользователь видел,
        // какие числа он ввел

        // Инициализируем переменные для хранения результата
        int minUniqueDigitsCount = Integer.MAX_VALUE; // Минимальное количество различных цифр
        int numberWithMinUniqueDigits = sourceNumbers[0]; // Число с минимальным количеством различных цифр

        // Проходим по всем числам в массиве
        for (int number : sourceNumbers) {
            // Преобразуем число в строку и убираем знак, если он есть
            String numberStr = String.valueOf(Math.abs(number));

            // Используем Set для хранения уникальных цифр
            Set<Character> uniqueDigits = new HashSet<>();

            // Проходим по всем символам строки (цифрам числа)
            for (char digit : numberStr.toCharArray()) {
                uniqueDigits.add(digit); // Добавляем цифру в Set
            }

            // Если текущее количество уникальных цифр меньше найденного минимального, обновляем значения
            if (uniqueDigits.size() < minUniqueDigitsCount) {
                minUniqueDigitsCount = uniqueDigits.size();
                numberWithMinUniqueDigits = number;
            }
        }

        // Выводим число с минимальным количеством различных цифр
        System.out.println("Число с минимальным количеством различных цифр: " + numberWithMinUniqueDigits);
    }
}
