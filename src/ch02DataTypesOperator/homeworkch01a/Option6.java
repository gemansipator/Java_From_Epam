package ch02DataTypesOperator.homeworkch01a;
//6. Найти число, цифры в котором идут в строгом порядке возрастания. Если
//таких чисел несколько, найти первое из них.
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Option6 {
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

        //Непосредственно задание.

        // Переменная для хранения числа с цифрами в порядке возрастания
        int ascendingNumber = -1;

        // Массив для хранения чисел, которые нужно вывести
        int[] uniqueNumbers = new int[size];
        int uniqueCount = 0; // Счетчик уникальных чисел

        // Проходим по всем числам в массиве
        for (int number : sourceNumbers) {
            // Преобразуем число в строку и убираем знак, если он есть
            String numberStr = String.valueOf(Math.abs(number));

            // Предполагаем, что цифры идут в порядке возрастания
            boolean isAscending = true;

            // Проходим по всем символам строки (цифрам числа)
            for (int i = 0; i < numberStr.length() - 1; i++) {
                if (numberStr.charAt(i) >= numberStr.charAt(i + 1)) {
                    isAscending = false; // Если текущая цифра не меньше следующей, устанавливаем флаг в false
                    break; // Прерываем цикл, так как порядок нарушен
                }
            }

            // Проверяем, было ли уже число добавлено в массив уникальных чисел
            boolean alreadyAdded = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueNumbers[j] == number) {
                    alreadyAdded = true;
                    break;
                }
            }

            // Если число не было добавлено ранее, добавляем его в массив уникальных чисел
            if (!alreadyAdded) {
                uniqueNumbers[uniqueCount++] = number;
            }

            // Если нашли число с цифрами в порядке возрастания, сохраняем его и прекращаем поиск
            if (isAscending && ascendingNumber == -1) {
                ascendingNumber = number;
            }
        }

        // Выводим числа, добавленные в массив уникальных чисел
        System.out.print("Числа: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueNumbers[i] + " ");
        }
        System.out.println();

        // Выводим результат по числу с цифрами в порядке возрастания
        if (ascendingNumber != -1) {
            System.out.println("Число с цифрами в порядке возрастания: " + ascendingNumber);
        } else {
            System.out.println("Нет числа с цифрами в порядке возрастания.");
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
/*Для решения задачи, где нужно вывести все числа, а повторяющиеся выводить только один раз (первое из них), можно воспользоваться следующими шагами:

Использовать массив для хранения чисел, которые нужно вывести.
Использовать цикл для обработки каждого числа в исходном массиве.
Проверять, встречалось ли число раньше, если нет, добавлять его в массив для вывода и отмечать, что оно встречалось.
*/