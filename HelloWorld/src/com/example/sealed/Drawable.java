package com.example.sealed;

public sealed interface Drawable permits Circle, Rectangle, Triangle, Erasable {
    void draw();
}
