package ch01IntroOOP.homeworkch01a;


/*Ввести целые числа как аргументы командной строки, подсчитать их суммы
 и произведения. Вывести результат на консоль.*/
public class Option5 {
    public static void main(String[] args) {
        int sum = 0;
        int result = 1;


        for (String arg : args) {

            sum = (sum + Integer.parseInt(arg));
            result = (result * Integer.parseInt(arg));


        }

        System.out.println("СУММА всех чисел введенных в качестве аргументов: "+ sum);
        System.out.println("ПРОИЗВЕДЕНИЕ всех чисел введенных в качестве аргументов: "+ result);

    }

}
