package com.sparta.shapes;

public class App {
    static void main() {
        Shape c = new Circle(12.0);
        Shape sq = new Square(8.0);
        Shape rect = new Rectangle(4.0, 5.0);

        System.out.println(c);      // outputs This shape has an area of 452.3893421169302
        System.out.println(sq);     // outputs This shape has an area of 64.0
        System.out.println(rect);
    }
}
