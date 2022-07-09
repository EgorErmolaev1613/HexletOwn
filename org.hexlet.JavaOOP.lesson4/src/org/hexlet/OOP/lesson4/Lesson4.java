//Создайте класс Point, который представляет точку. Реализуйте конструктор,
// который принимает два целых числа – координату по оси x и координату по оси y.
// В классе определите селекторы getX() и getY() для получения координат точки.
//
//        var point = new Point(2, 3);
//        point.getX(); // 2
//        point.getY(); // 3
//        src/main/java/io/hexlet/App.java
//        В классе App определите публичный статический метод getMidPoint(),
//        который принимает в качестве параметров две точки и возвращает новую точку,
//        лежащую между ними (середина отрезка).
package org.hexlet.OOP.lesson4;

public class Lesson4 {
    public static void main(String[] args) {
        Point firstPoint = new Point(4,3);
        Point secondPoint = new Point(6,1);
        Point thirdPoint = App.getMidPoint(firstPoint, secondPoint);
        System.out.println(thirdPoint.getX());
        System.out.println(thirdPoint.getY());

    }
}
 class Point {
        private int x;
        private int y;

     public int getX() {
         return x;
     }

     public Point(int x, int y) {
         this.x = x;
         this.y = y;
     }

     public int getY() {
         return y;
     }
 }
 class App {
        public static Point getMidPoint(Point point1,Point point2){

            return new Point (((point1.getX()+point2.getX())/2),((point1.getY()+point2.getY())/2));

        }
 }