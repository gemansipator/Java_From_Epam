package ch02DataTypesOperator.homeworkch01a;
//Найти количество чисел, содержащих только четные цифры, а среди них —
//количество чисел с равным числом четных и нечетных цифр
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Option5 {
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

        // Инициализируем переменные для хранения результатов
        int countEvenOnly = 0; // Количество чисел, содержащих только четные цифры
        int countEqualEvenOdd = 0; // Количество чисел с равным числом четных и нечетных цифр

        // Проходим по всем числам в массиве
        for (int number : sourceNumbers) {
            // Преобразуем число в строку и убираем знак, если он есть
            String numberStr = String.valueOf(Math.abs(number));

            boolean onlyEvenDigits = true; // Флаг, указывающий, что все цифры в числе четные
            int evenCount = 0; // Счетчик четных цифр
            int oddCount = 0; // Счетчик нечетных цифр

            // Проходим по всем символам строки (цифрам числа)
            for (char digitChar : numberStr.toCharArray()) {
                int digit = digitChar - '0'; // Преобразуем символ в цифру
                // Например, если digitChar = '5', то digit = '5' - '0' = 53 - 48 = 5

                if (digit % 2 == 0) {
                    evenCount++; // Увеличиваем счетчик четных цифр
                } else {
                    oddCount++; // Увеличиваем счетчик нечетных цифр
                    onlyEvenDigits = false; // Если найдена нечетная цифра, устанавливаем флаг в false
                }
            }

            // Если число содержит только четные цифры, увеличиваем соответствующий счетчик
            if (onlyEvenDigits) {
                countEvenOnly++;
            }

            // Если число содержит равное количество четных и нечетных цифр, увеличиваем соответствующий счетчик
            if (evenCount == oddCount) {
                countEqualEvenOdd++;
            }
        }

        // Выводим результаты
        System.out.println("Количество чисел, содержащих только четные цифры: " + countEvenOnly);
        System.out.println("Количество чисел с равным числом четных и нечетных цифр: " + countEqualEvenOdd);

        // Сохраняем текущую дату и время сдачи задания
        Date assignmentSubmittedDate = new Date();

        // Форматируем даты и выводим их
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Разработчик: Иванов Иван Иванович");
        System.out.println("Дата и время получения задания: " + dateFormat.format(assignmentReceivedDate));
        System.out.println("Дата и время сдачи задания: " + dateFormat.format(assignmentSubmittedDate));
    }
}
