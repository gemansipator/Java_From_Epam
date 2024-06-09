package ch01_IntroOOP.homeworkch01b;

import static ch01_IntroOOP.homeworkch01b.SumOfSquares.sumOfSquares; //импорт метода для вычисления суммы квадратов цифр числа

// Метод для проверки, является ли число счастливым

public class IsHappy {
    public static boolean isHappy(int number) {
        int slow = number; // Медленный указатель
        int fast = number; // Быстрый указатель
        do {
            slow = sumOfSquares(slow); // Медленный указатель движется на один шаг
            fast = sumOfSquares(sumOfSquares(fast)); // Быстрый указатель движется на два шага
        } while (slow != fast); // Повторяем, пока медленный и быстрый указатели не встретятся
        return slow == 1; // Если цикл замкнулся на 1, то число счастливое
    }
}
