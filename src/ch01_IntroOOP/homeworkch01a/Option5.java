package ch01_IntroOOP.homeworkch01a;
/*Ввести целые числа как аргументы командной строки, подсчитать их суммы
 и произведения. Вывести результат на консоль.*/
public class Option5 {
    public static void main(String[] args) {
        int sum = 0;
        for (String arg : args) {
            System.out.println();
            sum = (sum + Integer.parseInt(arg));
        }
        System.out.println("Сумма всех чисел введенных в качестве аргументов: "+ sum);
    }

}
