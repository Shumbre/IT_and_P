
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner  q = new Scanner(System.in);
        String s = q.nextLine();
        System.out.println(s + " : " + Boolean.toString(isPalindrome(s)));
    }

    // Возвращает строку в обратном порядке
    public static String reverseString(String s) {
        String res = "";
        for (int i = s.length()-1; i >= 0; i--) {
            res += s.charAt(i);  // возвращает символ расположенный по указанному индексу строки
        }
        return res;
    }

    // Проверяет является ли s палиндромом
    public static boolean isPalindrome(String s) {
        String res = "";
        for (int i = s.length()-1; i >= 0; i--) {
            res += s.charAt(i);
        }
        if (res.equals(reverseString(res))) {
            return true;
        } else {
            return false;
        }
    }
}