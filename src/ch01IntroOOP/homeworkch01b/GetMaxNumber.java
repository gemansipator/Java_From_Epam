package ch01IntroOOP.homeworkch01b;
// Метод для поиска максимального числа в массиве
public class GetMaxNumber {
    public static int getMaxNumber(int[] array) {
        int max = Integer.MIN_VALUE;
        // Проходим по массиву и находим максимальное число
        for (int number : array) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}
