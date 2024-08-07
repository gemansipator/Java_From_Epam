package ch02DataTypesOperator.homeworkchB;
 // Вывести на экран таблицу умножения.      Глава 2  Вариант заданий B
 public class MultiplicationTable {

  public static void main(String[] args) {
   // Указываем размер таблицы умножения (например, 10x10)
   int size = 10;

   // Вызываем метод для вывода таблицы умножения
   printMultiplicationTable(size);
  }

  /**
   * Метод для вывода таблицы умножения в консоль
   * @param size - размер таблицы
   */
  public static void printMultiplicationTable(int size) {
   // Печать заголовка таблицы
   System.out.println("Таблица умножения " + size + "x" + size + ":");

   // Печать первой строки с номерами
   System.out.print("     ");  // начальное смещение для более аккуратного отображения
   for (int i = 1; i <= size; i++) {
    System.out.printf("%4d", i);  // Выводим номер столбца с отступом для выравнивания
   }
   System.out.println(); // Переход на новую строку после вывода номеров столбцов

   // Печать разделительной линии
   System.out.print("    "); // Отступ перед линией
   for (int i = 0; i < size; i++) {
    System.out.print("----");  // Выводим линию, чтобы отделить заголовок от основной таблицы
   }
   System.out.println(); // Переход на новую строку

   // Вложенные циклы для заполнения таблицы умножения
   for (int i = 1; i <= size; i++) {
    // Печать номера строки
    System.out.printf("%2d |", i);  // Выводим номер строки с отступом и разделителем

    for (int j = 1; j <= size; j++) {
     // Печать произведения чисел
     System.out.printf("%4d", i * j);  // Выводим произведение с отступом для выравнивания
    }
    System.out.println(); // Переход на новую строку после вывода всей строки таблицы
   }
  }
 }

/*Объяснение кода
Объявление класса MultiplicationTable:

java
Копировать код
public class MultiplicationTable {
Этот код определяет новый класс с именем MultiplicationTable, в котором будет находиться наш основной метод main и метод
 для печати таблицы умножения.

Метод main:

java
Копировать код
public static void main(String[] args) {
    int size = 10;
    printMultiplicationTable(size);
}
public static void main(String[] args) - основной метод, который запускается при выполнении программы.
int size = 10; - здесь мы устанавливаем размер таблицы умножения. Вы можете изменить значение переменной size, если
хотите таблицу большего или меньшего размера.
printMultiplicationTable(size); - вызов метода printMultiplicationTable для печати таблицы в консоль.
Метод printMultiplicationTable:

java
Копировать код
public static void printMultiplicationTable(int size) {
Этот метод принимает параметр size, который определяет размер таблицы, и выводит ее на экран.

Печать заголовка таблицы:

java
Копировать код
System.out.println("Таблица умножения " + size + "x" + size + ":");
Это выводит строку с заголовком таблицы, указывающую ее размер.

Печать номеров столбцов:

java
Копировать код
System.out.print("     ");
for (int i = 1; i <= size; i++) {
    System.out.printf("%4d", i);
}
System.out.println();
System.out.print(" "); - начальный отступ для выравнивания заголовка.
for (int i = 1; i <= size; i++) - цикл для вывода номеров столбцов от 1 до size.
System.out.printf("%4d", i); - выводим номер столбца с отступом в 4 символа для выравнивания.
Печать разделительной линии:

java
Копировать код
System.out.print("    ");
for (int i = 0; i < size; i++) {
    System.out.print("----");
}
System.out.println();
Это создает разделительную линию под номерами столбцов.

Вложенные циклы для заполнения таблицы:

java
Копировать код
for (int i = 1; i <= size; i++) {
    System.out.printf("%2d |", i);
    for (int j = 1; j <= size; j++) {
        System.out.printf("%4d", i * j);
    }
    System.out.println();
}
Внешний цикл for (int i = 1; i <= size; i++) проходит по каждой строке таблицы.
System.out.printf("%2d |", i); - вывод номера строки с отступом и разделительной чертой.
Внутренний цикл for (int j = 1; j <= size; j++) проходит по каждому столбцу и вычисляет произведение i * j, выводя
 результат с отступом в 4 символа.
System.out.println(); - переход на новую строку после вывода всех произведений для текущей строки.
Пример вывода
После выполнения программы в консоль будет выведена таблица умножения размером 10x10:

lua
Копировать код
Таблица умножения 10x10:
      1   2   3   4   5   6   7   8   9  10
    ----------------------------------------
 1 |  1   2   3   4   5   6   7   8   9  10
 2 |  2   4   6   8  10  12  14  16  18  20
 3 |  3   6   9  12  15  18  21  24  27  30
 4 |  4   8  12  16  20  24  28  32  36  40
 5 |  5  10  15  20  25  30  35  40  45  50
 6 |  6  12  18  24  30  36  42  48  54  60
 7 |  7  14  21  28  35  42  49  56  63  70
 8 |  8  16  24  32  40  48  56  64  72  80
 9 |  9  18  27  36  45  54  63  72  81  90
10 | 10  20  30  40  50  60  70  80  90 100
Заключение
Эта программа на Java демонстрирует использование циклов, форматированного вывода и методов для организации кода.
*/