package ch02DataTypesOperator.homeworkch01a;

// 3 Вывести на консоль те числа, длина которых меньше (больше) средней,
//а также длину
import java.util.Arrays;
import java.util.Scanner;

public class Option3 {
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

        // Вычисляем среднюю длину чисел
        double averageLength = 0;
        for (int number : sourceNumbers) {
            // Добавляем длину числа (в строковом представлении) к общей сумме
            averageLength += String.valueOf(Math.abs(number)).length();
        }
        // Вычисляем среднюю длину, разделив сумму длин на количество чисел
        averageLength /= size;

        // Выводим среднюю длину чисел
        System.out.println("Средняя длина чисел: " + averageLength);

        // Выводим числа, длина которых меньше средней
        System.out.println("Числа, длина которых меньше средней: ");
        for (int number : sourceNumbers) {
            // Проверяем, если длина числа (в строковом представлении) меньше средней длины,
            // то выводим число на экран
            if (String.valueOf(Math.abs(number)).length() < averageLength) {
                System.out.println(number);
            }
        }

        // Выводим числа, длина которых больше средней
        System.out.println("Числа, длина которых больше средней: ");
        for (int number : sourceNumbers) {
            // Проверяем, если длина числа (в строковом представлении) больше средней длины,
            // то выводим число на экран
            if (String.valueOf(Math.abs(number)).length() > averageLength) {
                System.out.println(number);
            }
        }
    }
}
