
//src/main/java/io/hexlet/Geometric.java
//        Реализуйте интерфейс Geometric для работы с геометрическими фигурами. Этот интерфейс имеет два метода:
//
//        getName() – возвращает строку, имя геометрической фигуры
//        getSquare() – возвращает площадь геометрической фигуры
//        src/main/java/io/hexlet/Quadrate.java
//        Реализуйте класс Quadrate который представляет собой квадрат.
//        Класс должен реализовывать интерфейс Geometric.
//        Конструктор класса принимает в качестве аргумента сторону квадрата.
//
//        Так как класс реализует интерфейс Geometric,
//        вам понадобится определить в нём методы getName() и getSquare().
//        Метод getName() должен возвращать название фигуры – строку "quadrate", а метод getSquare() – площадь квадрата.
//
//        Geometric quadrate = new Quadrate(5);
//        src/main/java/io/hexlet/App.java
//        В классе App реализуйте публичный статический метод getFigureSquare(),
//        который принимает в качестве аргумента геометрическую фигуру типа Geometric.
//        Метод должен возвращать площадь фигуры в виде строки формата "Square of quadrate is 36"
package org.hexlet.OOP.lesson7;

    interface Geometric {
        String getName();

        int getSquare();
    }

        class Quadrate implements Geometric {
            int side;

            @Override
            public String getName() {
                return "quadrate";
            }

            @Override
            public int getSquare() {
                return (side * side);
            }

            public Quadrate(int side) {
                this.side = side;
            }
        }

        class App {
            public static String getFigureSquare(Geometric s) {
                return "Square of " + s.getName() + " is " + s.getSquare();
            }

        }

        class Main {
            public static void main(String[] args) {
                Quadrate q = new Quadrate(2);
                System.out.println(App.getFigureSquare(q));
            }
        }
