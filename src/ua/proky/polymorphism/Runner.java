package ua.proky.polymorphism;

public class Runner {
    public static void main(String[] args) {
        Shape[] shapes = {new Square(), new Circle(), new Triangle()};

        for (Shape shape : shapes) {
            shape.draw();
        }
    }

//    public static void main(String[] args) {
//        Shape shape = new Square();
//        shape.draw(); // Квадрат
//    }
}
