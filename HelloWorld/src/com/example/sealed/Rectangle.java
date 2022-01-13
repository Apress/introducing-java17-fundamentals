package com.example.sealed;

public sealed class Rectangle extends Shape implements Drawable, Erasable permits Square {

    double length, width;
    @Override
    public void draw() {
        System.out.println("Drawing rectangle...");
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double parameter() {
        return 2 * ( length + width );
    }

    @Override
    public void erase() {
        System.out.println("Erasing rectangle...");
    }
}
