package com.example.sealed;

public class Main {

    public static void main(String... args) {
        // write your code here
        Shape shape = new Circle(5.0);
        Shape anotherShape = new Rectangle();

        if (shape instanceof Circle) {
            ((Circle) shape).draw();
        }

        // pattern matching for instanceof
        if (anotherShape instanceof Circle c ) {
            c.draw();
        } else if ( anotherShape instanceof Rectangle r) {
            r.draw();
        } else {
            System.out.println("Unexpected Shape");
        }
        // shape = null;

//        if (shape == null) {
//            System.out.println("shape is null");
//        }

        switch(shape) {

            case null -> System.out.println("Shape is null");
            // case Square s -> s.draw();
            case Rectangle r -> r.draw();

            // guarded pattern for further refinement
            case (Circle c && c.getRadius() == 0.0) -> System.out.println("Drawing dot...");

            case Circle c ->  c.draw();
            case Triangle t -> t.draw();
            // default -> System.out.println("Unexpected Type");

        }
    }
}
