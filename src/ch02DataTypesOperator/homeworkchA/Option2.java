package ch02DataTypesOperator.homeworkchA;

// 2 Упорядочить и вывести числа в порядке возрастания (убывания) значений
//  их длины.
import java.util.Arrays;
import java.util.Scanner;

public class Option2 {
    public static void main(String[] args) {
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

        // Копируем массив для сортировки по возрастанию и убыванию длины
        int[] numbersAscending = Arrays.copyOf(sourceNumbers, size);  // Создаем копию исходного массива для сортировки
        // по возрастанию
        int[] numbersDescending = Arrays.copyOf(sourceNumbers, size);  // Создаем копию исходного массива для сортировки
        // по убыванию

        // Сортировка массива по возрастанию длины чисел (сортировка пузырьком)
        for (int i = 0; i < numbersAscending.length - 1; i++) {
            for (int j = 0; j < numbersAscending.length - 1 - i; j++) {
                // Сравниваем длины чисел (в строковом представлении, чтобы не учитывать знак)
                if (String.valueOf(Math.abs(numbersAscending[j])).length() > String.valueOf(Math.abs(numbersAscending[j + 1])).length()) {
                    // Меняем элементы местами, если текущее число длиннее следующего
                    int temp = numbersAscending[j];
                    numbersAscending[j] = numbersAscending[j + 1];
                    numbersAscending[j + 1] = temp;
                }
            }
        }

        // Сортировка массива по убыванию длины чисел (сортировка пузырьком)
        for (int i = 0; i < numbersDescending.length - 1; i++) {
            for (int j = 0; j < numbersDescending.length - 1 - i; j++) {
                // Сравниваем длины чисел (в строковом представлении, чтобы не учитывать знак)
                if (String.valueOf(Math.abs(numbersDescending[j])).length() < String.valueOf(Math.abs(numbersDescending[j + 1])).length()) {
                    // Меняем элементы местами, если текущее число короче следующего
                    int temp = numbersDescending[j];
                    numbersDescending[j] = numbersDescending[j + 1];
                    numbersDescending[j + 1] = temp;
                }
            }
        }

        // Вывод результатов
        System.out.println("Числа в порядке возрастания длины: " + Arrays.toString(numbersAscending));  // Выводим отсортированный по возрастанию длины массив
        System.out.println("Числа в порядке убывания длины: " + Arrays.toString(numbersDescending));  // Выводим отсортированный по убыванию длины массив
    }
}
/*Пояснение шагов:
Импорт библиотек:

import java.util.Scanner;: Импортируем класс Scanner для ввода данных с консоли.
import java.util.Arrays;: Импортируем класс Arrays для работы с массивами.
Создание объекта Scanner и ввод данных:

Scanner scanner = new Scanner(System.in);: Создаем объект Scanner для считывания ввода с консоли.
System.out.print("Сколько целых чисел вы собираетесь ввести? ");: Запрашиваем у пользователя количество чисел.
int size = scanner.nextInt();: Считываем количество чисел, которые пользователь собирается ввести.
int[] sourceNumbers = new int[size];: Создаем массив sourceNumbers с размером, указанным пользователем.
Заполнение массива введенными числами:

System.out.print("Введите целые числа через пробел и нажмите <Enter>: ");: Запрашиваем у пользователя ввод чисел.
for (int i = 0; i < sourceNumbers.length; i++) { sourceNumbers[i] = scanner.nextInt(); }: Заполняем массив sourceNumbers
 введенными числами.
Вывод введенного массива:

System.out.println("Ваш массив: " + Arrays.toString(sourceNumbers));: Выводим массив на экран.
Копирование массива для сортировки:

int[] numbersAscending = Arrays.copyOf(sourceNumbers, size);: Создаем копию исходного массива для сортировки по
 возрастанию.
int[] numbersDescending = Arrays.copyOf(sourceNumbers, size);: Создаем копию исходного массива для сортировки по
 убыванию.
Сортировка по возрастанию длины чисел:

for (int i = 0; i < numbersAscending.length - 1; i++) { for (int j = 0; j < numbersAscending.length - 1 - i; j++) { ... }
}:
Внешний и внутренний циклы для сортировки пузырьком.
if (String.valueOf(Math.abs(numbersAscending[j])).length() > String.valueOf(Math.abs(numbersAscending[j + 1])).length())
{ int temp = numbersAscending[j]; numbersAscending[j] = numbersAscending[j + 1]; numbersAscending[j + 1] = temp; }:
Сравнение длины чисел и обмен значениями, если текущее число длиннее следующего.
Сортировка по убыванию длины чисел:

for (int i = 0; i < numbersDescending.length - 1; i++) { for (int j = 0; j < numbersDescending.length - 1 - i; j++)
{ ... } }:
Внешний и внутренний циклы для сортировки пузырьком.
if (String.valueOf(Math.abs(numbersDescending[j])).length() < String.valueOf(Math.abs(numbersDescending[j + 1])).length())
{ int temp = numbersDescending[j]; numbersDescending[j] = numbersDescending[j + 1]; numbersDescending[j + 1] = temp; }:
Сравнение длины чисел и обмен значениями, если текущее число короче следующего.
Вывод результатов:

System.out.println("Числа в порядке возрастания длины: " + Arrays.toString(numbersAscending));: Выводим отсортированный
по возрастанию длины массив.
System.out.println("Числа в порядке убывания длины: " + Arrays.toString(numbersDescending));: Выводим отсортированный по
убыванию длины массив.
Таким образом, этот код позволяет сортировать массив чисел по длине их значений с использованием циклов и массивов, без
использования Comparator или других встроенных средств сортировки.*/