//src/main/java/io/hexlet/geometry/Quadrate.java
//        В файле находится класс Quadrate, который представляет геометрическую фигуру квадрат.
//        Основываясь на структуре директорий, определите в файле пакет с нужным именем.
//
//        src/main/java/io/hexlet/App.java
//        В файле определите пакет и импортируйте класс Quadrate.
//        Реализуйте классApp с публичным статическим методом enlargeQuadrate().
//        Метод принимает в качестве аргумента квадрат и возвращает новый квадрат,
//        сторона которого в два раза больше, чем у переданного.
package io.hexlet;
import  io.hexlet.geometry.*;
public class App {
    public static Quadrate enlargeQuadrate (Quadrate q) {

        return new Quadrate(q.getSide()*2);
    }
}

    package io.hexlet.geometry;
// END

public final class Quadrate {
    private int side;

    public Quadrate(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }
}