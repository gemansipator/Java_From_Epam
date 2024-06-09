package ch01_IntroOOP.homeworkch01b;
/*Вариант B
Ввести с консоли n целых чисел. На консоль вывести:
1. Четные и нечетные числа.*/

import java.util.*;

import static ch01_IntroOOP.homeworkch01b.GetMaxNumber.getMaxNumber;
import static ch01_IntroOOP.homeworkch01b.IsHappy.isHappy;
import static ch01_IntroOOP.homeworkch01b.IsPrime.isPrime;
import static ch01_IntroOOP.homeworkch01b.IsPrime2.isPrime2;

public class Option1234567891011 {
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

        //ВЫВЕСТИ ЧЁТНЫЕ И НЕЧЁТНЫЕ ЧИСЛА:

        //x % 2 - вычисляет остаток от деления x на 2.
        int counter;
        int evenNumbers;  //четные числа
        int oddNumbers;   //нечетные числа

        System.out.println("Четные числа: ");
        for (counter = 0; counter < sourceNumbers.length; counter++) {
            int namber = sourceNumbers[counter];
            if (namber % 2 == 0) {
                evenNumbers = namber;

                System.out.print(" " + evenNumbers);
            }
        }
        System.out.println();
        System.out.println("Нечетные числа: ");
        for (counter = 0; counter < sourceNumbers.length; counter++) {
            int namber = sourceNumbers[counter];
            if (namber % 2 != 0) {
                oddNumbers = namber;
                System.out.print(" " + oddNumbers);
            }
        }
        System.out.println("\n");

        // Наибольшее и наименьшее число

        int max = sourceNumbers[0]; // начальное значение МАКСИМАЛЬНОГО элемента
        System.out.println("НАИБОЛЬШЕЕ число: ");
        for (counter = 0; counter < sourceNumbers.length; counter++) {
            int sourceX = sourceNumbers[counter];
            if (max < sourceX) {
                max = sourceX;
            }
        }
        System.out.println(max);

        int min = sourceNumbers[0]; // начальное значение МАКСИМАЛЬНОГО элемента
        System.out.println("НАИМЕНЬШЕЕ число: ");
        for (counter = 0; counter < sourceNumbers.length; counter++) {
            int sourceX = sourceNumbers[counter];
            if (min > sourceX) {
                min = sourceX;
            }
        }
        System.out.println(min + "\n");

        //Числа, которые делятся на 3 или на 9.

        int anyNumber;
        System.out.println("Это число делится на 3 ИЛИ на 9: ");
        for (counter = 0; counter < sourceNumbers.length; counter++) {
            int namber = sourceNumbers[counter];
            if (namber % 9 == 0 || namber % 3 == 0) {
                anyNumber = namber;

                System.out.print(anyNumber + " ");
            }
        }
        System.out.println("\n");
        System.out.println("Это число делится на 5  И на 7: ");
        for (counter = 0; counter < sourceNumbers.length; counter++) {
            int namber = sourceNumbers[counter];
            if (namber % 5 == 0 && namber % 7 == 0) {
                anyNumber = namber;
                System.out.println(anyNumber + " ");
            }
        }
        System.out.println("\n");

        //5. Все трехзначные числа, в десятичной записи которых нет одинаковых
        //цифр.

        System.out.println("Эти числа ТРЕХЗНАЧНЫЕ и УНИКАЛЬНЫЕ : ");
        int[] uniqueNumbers = sourceNumbers;
        uniqueNumbers = Arrays.stream(uniqueNumbers)
                .distinct().toArray();    //Удалить повторяющиеся элементы в массиве можно с помощью метода distinct():

        System.out.println(Arrays.toString(uniqueNumbers));

        for (counter = 0; counter < uniqueNumbers.length; counter++) {
            int namber = uniqueNumbers[counter];
            if (namber > 99 && namber < 1000) {

                anyNumber = namber;
                System.out.println(anyNumber + " ");
            }
        }
        System.out.println("\n");

        //ПРОСТЫЕ ЧИСЛА

        System.out.println("Простые числа. Вариант метода isPrime первый:");
        for (int number : sourceNumbers) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }


        System.out.println("\n");

        System.out.println("Простые числа. вариант метода isPrime второй:");
        for (int number : sourceNumbers) {
            if (isPrime2(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println("\n");


        //7. Отсортированные числа в порядке возрастания и убывания.
        System.out.println("Ваш массив: " + Arrays.toString(sourceNumbers));
        System.out.println("\n Сортировка в порядке ВОЗРАСТЕНИЯ: ");
        boolean isSort = true;
        while (isSort) {
            isSort = false;
            for (int i = 1; i < sourceNumbers.length; i++) {
                if (sourceNumbers[i] < sourceNumbers[i - 1]) {
                    int temp = sourceNumbers[i];       //сохраняем значение второго элемента
                    sourceNumbers[i] = sourceNumbers[i - 1]; // В второй элемент записываем значение первого элемента
                    sourceNumbers[i - 1] = temp;             // в первый элемент записываем значение второго элемента
                    isSort = true;
                    System.out.println(Arrays.toString(sourceNumbers));
                }

            }

        }
        System.out.println("\n");

        System.out.println("Ваш массив после сортировки по ВОЗРАСТАНИЯ: " + Arrays.toString(sourceNumbers));

        System.out.println("\n Сортировка в порядке УБЫВАНИЯ: ");
        boolean isSort2 = true;
        while (isSort2) {
            isSort2 = false;
            for (int i = 1; i < sourceNumbers.length; i++) {
                if (sourceNumbers[i] > sourceNumbers[i - 1]) {
                    int temp = sourceNumbers[i - 1];  //сохраняем значение первого элемента
                    sourceNumbers[i - 1] = sourceNumbers[i]; // В первый элемент записываем значение второго элемента
                    sourceNumbers[i] = temp;            // в второй элемент записываем сохраненное значение первого элемента
                    isSort2 = true;
                    System.out.println(Arrays.toString(sourceNumbers));
                }

            }

        }
        System.out.println("\n");
        System.out.println("Ваш массив после сортировки по УБЫВАНИЯ: " + Arrays.toString(sourceNumbers));

        System.out.println("\n");


        // 8. Числа в порядке убывания частоты встречаемости чисел.

        // Определяем максимальное значение в исходном массиве для создания массива частоты
        int maxNumber = getMaxNumber(sourceNumbers);
        // Создаем массив для хранения частоты встречаемости чисел
        int[] frequencyArray = new int[maxNumber + 1];

        // Подсчитываем частоту встречаемости каждого числа в массиве
        for (int number : sourceNumbers) {
            frequencyArray[number]++;
        }

        // Создаем массив для хранения пар чисел и их частоты встречаемости
        int[] numbers = new int[maxNumber + 1];
        int[] frequencies = new int[maxNumber + 1];
        int count = 0;

        // Заполняем массивы записей из массива частоты
        for (int i = 0; i < frequencyArray.length; i++) {
            if (frequencyArray[i] != 0) {
                numbers[count] = i;
                frequencies[count] = frequencyArray[i];
                count++;
            }
        }

        // Сортируем массивы записей по убыванию частоты встречаемости (сортировка пузырьком)
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                // Сравниваем частоты встречаемости текущего и следующего чисел
                if (frequencies[j] < frequencies[j + 1]) {
                    // Если частота встречаемости текущего числа меньше,
                    // чем у следующего числа, меняем их местами
                    int tempNumber = numbers[j];
                    int tempFrequency = frequencies[j];
                    numbers[j] = numbers[j + 1];
                    frequencies[j] = frequencies[j + 1];
                    numbers[j + 1] = tempNumber;
                    frequencies[j + 1] = tempFrequency;
                }
            }
        }

        // Выводим числа в порядке убывания частоты встречаемости
        System.out.println("Числа в порядке убывания частоты встречаемости: ");
        for (int i = 0; i < count; i++) {
            int number = numbers[i];
            int frequency = frequencies[i];
            // Печатаем каждое число столько раз, какова его частота встречаемости
            for (int j = 0; j < frequency; j++) {
                System.out.print(number + " ");
            }
        }

        System.out.println("\n");
        // 9. «Счастливые» числа.

        // Вывод счастливых чисел
        System.out.println("Счастливые числа:");
        for (int number : sourceNumbers) {
            if (isHappy(number)) { // Проверяем, является ли текущее число счастливым
                System.out.print(number + " "); // Если число счастливое, выводим его
            }
        }




    }


}
