package ch01IntroOOP.objectreferences;

public class ComparisonString {
    public static void main(String[ ] args) {
        String str1, str2;
        str1 = "Java";
        str2 = str1; // variable refers to the same string (переменная относится к той же строке)
        System.out.println("comparison of references " + (str1 == str2)); // true
        str2 = new String("Java"); // is equivalent to str2 = new String(str1);
        System.out.println("comparison of references "+ (str1 == str2)); // false
        System.out.println("comparison of values " + str1.equals(str2)); // true
    }
}

/*
*Объектные ссылки
Java работает не с объектами, а со ссылками на объекты, размещаемыми
в динамической памяти с помощью оператора new. Это объясняет то, что операции сравнения ссылок на объекты
* не имеют смысла, так как при этом сравниваются адреса. Для сравнения объектов на эквивалентность по значению
необходимо использовать специальные методы, например, equals(Object ob).
Этот метод наследуется в каждый класс из суперкласса Object, который лежит
в корне дерева иерархии всех классов и должен переопределяться в подклассе
для определения эквивалентности содержимого двух объектов этого класса.
*
*В результате выполнения действия str2 = str1 получается, что обе ссылки
ссылаются на один и тот же объект. Оператор «==» возвращает true при сравнении ссылок только в том случае,
* если они ссылаются на один и тот же объект.
Если же ссылку str2 инициализировать конструктором new String(str1), то
создается новый объект в другом участке памяти, который инициализируется
значением, взятым у объекта str1. В итоге существуют две ссылки, каждая из
которых независимо ссылается на объект, который никак физически не связан
с другим объектом. Поэтому оператор сравнения ссылок возвращает результат
false, так как ссылки ссылаются на различные участки памяти. Объекты обладают одинаковыми значениями, что
* легко определяется вызовом метода
equals(Object ob).
24
// # 13 # чтение символа из потока System.in # ReadCharMain.java 24
Если в процессе разработки возникает необходимость в сравнении по значению объектов классов, созданных
* программистом, для этого следует переопределить в данном классе метод equals(Object ob) в соответствии
* с теми критериями сравнения, которые существуют для объектов данного типа или по
стандартным правилам, заданным в документации.
*
*
*
* */