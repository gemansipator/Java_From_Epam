package ch01_IntroOOP.homeworkch01b;
// Метод для вычисления суммы квадратов цифр числа
public class SumOfSquares {
    public static int sumOfSquares(int number) {
        int sum = 0; // Инициализируем сумму квадратов цифр числа
        while (number > 0) {
            int digit = number % 10; // Получаем последнюю цифру числа
            sum += digit * digit; // Добавляем квадрат этой цифры к сумме
            number /= 10; // Убираем последнюю цифру из числа
        }
        return sum; // Возвращаем сумму квадратов цифр
    }
}
