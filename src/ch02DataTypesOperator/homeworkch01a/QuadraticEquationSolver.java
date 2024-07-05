package ch02DataTypesOperator.homeworkch01a;
// 9 Найти корни квадратного уравнения. Параметры уравнения передавать
//с командной строкой.

import java.util.Date; // Для работы с датой и временем
import java.text.SimpleDateFormat; // Для форматирования даты и времени
import java.util.Scanner; // Для считывания ввода с консоли

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        // Сохраняем текущую дату и время получения задания
        Date assignmentReceivedDate = new Date();

        // Создаем объект Scanner для считывания ввода с консоли
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя коэффициенты квадратного уравнения
        System.out.print("Введите коэффициент a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите коэффициент b: ");
        double b = scanner.nextDouble();
        System.out.print("Введите коэффициент c: ");
        double c = scanner.nextDouble();

        // Выводим уравнение
        System.out.println("Решаем уравнение: " + a + "x^2 + " + b + "x + " + c + " = 0");

        // Вычисляем дискриминант
        double discriminant = b * b - 4 * a * c;
        System.out.println("Дискриминант (D) = " + discriminant);

        // Находим корни в зависимости от значения дискриминанта
        if (discriminant > 0) {
            // Два действительных корня
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + root1 + ", x2 = " + root2);
        } else if (discriminant == 0) {
            // Один действительный корень
            double root = -b / (2 * a);
            System.out.println("Уравнение имеет один корень: x = " + root);
        } else {
            // Нет действительных корней
            System.out.println("Уравнение не имеет действительных корней.");
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
