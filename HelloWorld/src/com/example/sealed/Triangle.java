package com.example.sealed;

public non-sealed class Triangle extends Shape implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing triangle...");
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double parameter() {
        return 0;
    }
}
