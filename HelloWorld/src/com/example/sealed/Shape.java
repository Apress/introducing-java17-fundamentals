package com.example.sealed;

public abstract sealed class Shape permits Circle, Rectangle, Triangle {
    public abstract double area();
    public abstract double parameter();
}
