package ua.proky.polymorphism;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Квадрат");
    }

//    public static void main(String[] args) {
//        Circle circle = new Circle();
//        circle.run();
//    }
}

class Circle implements Shape {

    public static void run() {
        System.out.println("run");
    }

    @Override
    public void draw() {
        System.out.println("Круг");
    }
}

class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Треугольник");
    }
}

