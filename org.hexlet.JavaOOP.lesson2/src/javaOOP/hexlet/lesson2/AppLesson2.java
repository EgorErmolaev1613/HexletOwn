//В этом упражнении уже реализован класс Point, который представляет точку. Работать
//        с точкой нужно следующим образом:
//
//// Создание объекта точки
//// Первый параметр - координата точки по оси X
//// Второй - координата по оси Y
//        var point = new Point(3, 4);
//
//// Получение координаты точки по оси Х
//        point.getX(); // 3
//// Получение координаты точки по оси Y
//        point.getY(); // 4
//        В классе App допишите публичный статический метод getSymmetricalPoint(),
//        который принимает в качестве аргумента точку (объект класса Point).
//        Метод должен вернуть новую точку (объект класса Point), которая будет симметрична
//        заданной относительно оси X.
//
//

package javaOOP.hexlet.lesson2;

public class AppLesson2 {

}
class App {
    public static Point getSymmetricalPoint(Point point) {
        // BEGIN (write your solution here)
        int reverseY = point.getY()*-1;
        Point reversePoint = new Point (point.getX(),reverseY);
        return reversePoint;
        // END
    }
}
