//Создайте класс App и в нём реализуйте публичный статический метод isPalindrome().
// Метод должен определять,является ли слово палиндромом или нет.
//        Палиндром – это слово, которое читается одинаково в обоих направлениях.
package org.hexlet.OOP.lesson6;
import org.apache.commons.lang3.StringUtils;

public class Lesson6 {
    public static void main(String[] args) {                                //для проверки
        System.out.println(App.isPalindrome("Шалаш"));
    }
}
class App {
    public static boolean isPalindrome(String word) {
        return word.equalsIgnoreCase(StringUtils.reverse(word));
    }
}