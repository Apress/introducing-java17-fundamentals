package com.example.sealed;

public non-sealed class Circle extends Shape implements Drawable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle...");
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double parameter() {
        return 2 * Math.PI * radius;
    }
}
