package ua.proky;

import ua.proky.polymorphism.Square;

public class Runner {
    public static void main(String[] args) {
//        testInstanseOf();


        MyChildObject child = new MyChildObject();
        child.setField("str1");
        child.setV1(true);

        MyObject my = new MyObject();
        my.setField("str1");

        System.out.println("my.equals(child) = " + my.equals(child));
        System.out.println("child.equals(my) = " + child.equals(my));


    }

    public static void testInstanseOf() {
        Parent parent = new Parent();
        Child child = new Child();
        Object o = new Object();

        System.out.println(parent instanceof Child);
        System.out.println(child instanceof Parent);
        System.out.println(child instanceof Object);
        System.out.println(o instanceof Child);
    }
}


class Parent {
    int age;
}

class Child  extends Parent {

}

