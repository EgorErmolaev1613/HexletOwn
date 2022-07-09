//Создайте класс User для работы с пользователем. В классе реализуйте конструктор,
// который принимает в качестве аргументов id пользователя и его ник.
// Создайте в классе необходимые свойства и геттеры для них
//
// Реализуйте в классе метод isEqual(), который сравнивает текущего пользователя
// с переданным на основе их идентификаторов.
// Если идентификаторы пользователей равны, то это один и тот же пользователь.
package org.hexlet.OOP.lesson5;

import java.util.Objects;

public class Lesson5 {
    public static void main(String[] args) {

    }
}
class User {
    private int id;
    private String nickName;

    public User(int id, String nickName) {
        this.id = id;
        this.nickName = nickName;
    }

    public int getId() {
        return id;
    }

    public String getNickName() {
        return nickName;
    }


    public boolean isEqual(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return getId() == user.getId();
    }

}