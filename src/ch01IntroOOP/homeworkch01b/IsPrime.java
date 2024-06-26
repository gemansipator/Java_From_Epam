package ch01IntroOOP.homeworkch01b;

public class IsPrime {
    public static boolean isPrime(int number) { //Метод isPrime проверяет, является ли число простым.
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) { //Число считается простым, если оно больше 1 и
            // делится только на 1 и само себя.
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
/*Метод isPrime проверяет, является ли число простым.
Число считается простым, если оно больше 1 и делится только на 1 и само себя.
Для проверки используем цикл от 2 до квадратного корня из числа (оптимизация для сокращения числа проверок).
Эта программа учитывает, что числа могут быть как положительными, так и отрицательными. Простыми числами считаются
 только положительные числа больше 1.*/