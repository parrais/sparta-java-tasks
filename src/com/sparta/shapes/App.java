package com.sparta.shapes;

public class App {
    static void main() {
        Circle c = new Circle(12.0);
        Square sq = new Square(8.0);

        System.out.println(c);      // outputs This shape has an area of 452.3893421169302
        System.out.println(sq);     // outputs This shape has an area of 64.0
    }
}
