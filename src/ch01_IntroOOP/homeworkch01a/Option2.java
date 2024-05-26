package ch01_IntroOOP.homeworkch01a;
/*Отобразить в окне консоли аргументы командной строки в обратном порядке.*/
public class Option2 {
    public static void main(String[] args){
        for (String str : args) {
            System.out.printf("Argument--> %s%n", str);
        }
        System.out.println("\nТот же результат" +
                "был бы получен при использовании традиционного вида цикла for: ");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument--> " + args[i]);
        }

        System.out.println("\nТеперь В ОБРАТНОМ ПОРЯДКЕ: ");
        for( int i = args.length - 1 ; i >= 0 ; i--)
            System.out.println("Reverse : " + args[i]);
    }

}
