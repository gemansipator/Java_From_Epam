package ch02DataTypesOperator.homeworkch01a;
//Найти число, цифры в котором идут в строгом порядке возрастания. Если
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


        // Инициализация переменной для хранения числа с цифрами в порядке возрастания:
        int ascendingNumber = -1;

        // Проходим по всем числам в массиве
        for (int number : sourceNumbers) {
            // Преобразуем число в строку и убираем знак, если он есть
            String numberStr = String.valueOf(Math.abs(number));

            // Предполагаем, что цифры идут в порядке возрастания
            boolean isAscending = true;

            // Проходим по всем символам строки (цифрам числа)
            for (int i = 0; i < numberStr.length() - 1; i++) {
                if (numberStr.charAt(i) >= numberStr.charAt(i + 1)) {
                    isAscending = false; // Если текущая цифра не меньше следующей,
                    // устанавливаем флаг в false
                    break; // Прерываем цикл, так как порядок нарушен
                }
            }

            // Если нашли число с цифрами в порядке возрастания, сохраняем его и прекращаем поиск
            if (isAscending) {
                ascendingNumber = number;
                break;
            }
        }

        // Выводим результат
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
/*Чтобы найти число, в котором цифры идут в строгом порядке возрастания, можно выполнить следующие
шаги:

Проходить по каждому числу в массиве.
Преобразовать число в строку и проверить, идут ли цифры в строке в порядке возрастания.
Если найдено число, в котором цифры идут в строгом порядке возрастания, сохранить его и прекратить
дальнейший поиск.*/