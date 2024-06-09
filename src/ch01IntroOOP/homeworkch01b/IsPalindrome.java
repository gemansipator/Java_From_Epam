package ch01IntroOOP.homeworkch01b;
// в этом классе метод етод для проверки, является ли число палиндромом
public class IsPalindrome {
    public static boolean isPalindrome(int number) {
        String str = String.valueOf(number); // Преобразуем число в строку
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false; // Если символы не совпадают, число не является палиндромом
            }
        }
        return true; // Если все символы совпадают, число является палиндромом
    }
}
