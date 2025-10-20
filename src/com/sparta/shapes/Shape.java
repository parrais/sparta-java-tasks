package com.sparta.shapes;

public abstract class Shape {
    abstract double calculateArea();

    @Override
    public String toString() {
        return "This shape has an area of " + calculateArea();
    }
}
