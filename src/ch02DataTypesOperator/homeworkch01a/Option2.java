package ch02DataTypesOperator.homeworkch01a;

// 2 Упорядочить и вывести числа в порядке возрастания (убывания) значений
//  их длины.
import java.util.Arrays;
import java.util.Comparator;
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

        // Преобразуем int[] в Integer[]
        Integer[] numbersAscending = new Integer[size];
        Integer[] numbersDescending = new Integer[size];
        for (int i = 0; i < size; i++) {
            numbersAscending[i] = sourceNumbers[i];
            numbersDescending[i] = sourceNumbers[i];
        }

        // Сортировка массива по возрастанию длины чисел
        Arrays.sort(numbersAscending, Comparator.comparingInt(num -> String.valueOf(Math.abs(num)).length()));

        // Сортировка массива по убыванию длины чисел
        Arrays.sort(numbersDescending, (a, b) -> Integer.compare(String.valueOf(Math.abs(b)).length(), String.valueOf(Math.abs(a)).length()));

        // Вывод результатов
        System.out.println("Числа в порядке возрастания длины: " + Arrays.toString(numbersAscending));
        System.out.println("Числа в порядке убывания длины: " + Arrays.toString(numbersDescending));
    }
}
/*Пояснение шагов:
Ввод данных:

Создаем объект Scanner для считывания ввода с консоли.
Запрашиваем у пользователя количество чисел и сохраняем его в переменной size.
Создаем массив sourceNumbers размером size.
Запрашиваем у пользователя ввод чисел и заполняем массив sourceNumbers.
Вывод массива:

Выводим массив sourceNumbers на экран, чтобы пользователь видел, какие числа были введены.
Копирование массивов:

Создаем копии массива sourceNumbers для сортировки по возрастанию (numbersAscending) и по убыванию (numbersDescending).
Сортировка массивов:

Вызываем метод sortByLength для сортировки массива numbersAscending по возрастанию длины чисел.
Вызываем метод sortByLength для сортировки массива numbersDescending по убыванию длины чисел.
Вывод результатов:

Выводим отсортированные массивы на экран: один массив, отсортированный по возрастанию длины чисел, другой — по убыванию
длины чисел.
Метод sortByLength:
Описание: Метод сортирует массив по длине чисел.
Параметры:
array: массив для сортировки.
ascending: если true, сортировка по возрастанию, если false — по убыванию.
Алгоритм: Метод использует пузырьковую сортировку:
Проходим по массиву, сравнивая длины текущего и следующего элементов.
Если порядок неправильный (для возрастания или убывания), меняем элементы местами.
Продолжаем, пока массив не будет отсортирован.
Таким образом, мы реализуем сортировку чисел по длине их значений без использования потоков и компараторов, используя
 только циклы и массивы.*/