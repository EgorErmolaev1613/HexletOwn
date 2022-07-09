package org.hexlet;
import org.apache.commons.lang3.RandomUtils;
//В классе App реализуйте публичный статический метод getSquare(), который принимает в качестве
//        аргументов две стороны треугольника и угол между ними в градусах, а возвращает площадь
//        этого треугольника в виде числа типа double.
//        Площадь треугольника вычисляется, как половина произведения этих сторон, умноженная
//        на синус угла между ними.
public class Main {
}
    class App{


       public static double getSquare  (double side1, double side2, double angle){

           return ((side1*side2)/2)*Math.sin(angle*Math.PI/180);
    }
    }

