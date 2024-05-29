package ch01_IntroOOP.homeworkch01a;
/*Вывести заданное количество случайных чисел с переходом и без перехода
на новую строку.*/

import java.util.Scanner;

public class Option3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Для генерации случайных чисел (сгенерируется от 1 до 50) с выводом в одну строку, ");
        System.out.println("введите их количество: ");
        int numberOfRequests = scanner.nextInt();
        int minValue = 1;
        int maxValue = 50;
        int counter;
        for(counter = 0; counter < numberOfRequests; counter++){
            int randomValue = minValue + (int) (Math.random() * (maxValue - minValue + 1));
            System.out.print(randomValue+" ");
        }

        System.out.println("\n");
        System.out.println("Для генерации случайных чисел (сгенерируется от 1 до 50) с переходом на новую строку, ");
        System.out.println("введите их количество: ");
        int numberOfRequests2 = scanner.nextInt();
        int minValue2 = 1;
        int maxValue2 = 50;
        int counter2;
        for(counter2 = 0; counter2 < numberOfRequests2; counter2++){
            int randomValue = minValue2 + (int) (Math.random() * (maxValue2 - minValue2 + 1));
            System.out.println(randomValue+" ");
        }
        scanner.close();




    }
}
/*
Как повторить цикл определенное количество раз в Java?
Базовый цикл for в Java имеет следующую структуру: for(инициализация; условие; приращение/уменьшение){ //код } .
Эта структура позволяет повторять блок кода определенное количество раз, что делает ее мощным инструментом
в наборе инструментов любого Java-программиста.
*/
/*
В Java для генерации случайных чисел используется класс Math и его метод random(). Этот метод возвращает
случайное число с плавающей точкой в диапазоне от 0.0 (включительно) до 1.0 (исключительно).

Однако, что делать, если требуется получить случайное число в другом диапазоне, например, от 1 до 50?

Для этого нужно использовать формулу преобразования диапазона случайного числа. Эта формула выглядит так:

minValue + Math.random() * (maxValue - minValue + 1)

Где minValue — это минимальное значение диапазона, а maxValue — максимальное.

Таким образом, если требуется получить случайное число от 1 до 50, код будет выглядеть следующим образом:

123
int minValue = 1;
int maxValue = 50;
int randomValue = minValue + (int) (Math.random() * (maxValue - minValue + 1));
В этом коде Math.random() генерирует случайное число от 0 до 1, которое затем умножается на
(maxValue - minValue + 1). Результат прибавляется к minValue, что сдвигает диапазон от 0-1 до minValue-maxValue.

Таким образом, можно получить случайное число в любом заданном диапазоне, используя Math.random().
Важно помнить, что этот метод возвращает число с плавающей точкой, поэтому для получения целого числа
результат нужно привести к целому типу с помощью оператора (int).
*/