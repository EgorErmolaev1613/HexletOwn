//Окружность – это геометрическая фигура, все точки которой равноудалены от центра.
// Чтобы однозначно определить окружность на плоскости, достаточно знать координаты
// центра окружности и её радиус
//
//
//        В файле Circle.java реализуйте класс Circle с публичными свойстваи x, y и radius,
//        который будет представлять окружность. Определите в классе конструктор
//
//// Создаём круг
//// В конструктор передаём координаты X и Y центра окружности и её радиус
//        var circle = new Circle(1, 2, 5);
//
//// Обращение к свойству объекта
//        circle.x = 1;
//        src/main/java/io/hexlet/App.java
//        В классе App реализуйте публичный статический метод getCircumference(),
//        который принимает в качестве аргумента окружность. Метод должен возвращать длину окружности
//
//        var circle = new Circle(1, 2, 5);
//
//        App.getCircumference(circle); // Приблизительно 31.4

        package org.hexlet.OOP.lesson3;

public class Lesson3 {
    public static void main(String[] args) {



    }

}
   class Circle {
   public double x;
    public double y;
    public static double radius;

        public Circle(double x, double y, double radius) {
            this.x = x;
            this.y = y;
            this.radius = radius;
        }
    }
    class App {
        public static double getCircumference(Circle с) {
            return Circle.radius*2*Math.PI;
        }
    }