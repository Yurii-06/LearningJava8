package ua.proky.java8.ex1;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Student {
    private String name;
    private int age;
    private long homeDistance;
    private double weight;
    private School school;

    public Student(String name, int age, long homeDistance, double weight,
        School school) {
        this.name = name;
        this.age = age;
        this.homeDistance = homeDistance;
        this.weight = weight;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getHomeDistance() {
        return homeDistance;
    }

    public double getWeight() {
        return weight;
    }

    public School getSchool() {
        return school;
    }

    public static List<Student> getStudentList() {
        Student s1 = new Student("Ram", 18, 3455, 60.75, new School("AB College", "Noida"));
        Student s2 = new Student("Shyam", 22, 3252, 65.80, new School("RS College", "Gurugram"));
        Student s3 = new Student("Mohan", 18, 1459, 65.20, new School("AB College", "Noida"));
        Student s4 = new Student("Mahesh", 22, 4450, 70.25, new School("RS College", "Gurugram"));
//        return List.of(s1, s2, s3, s4);
        return Arrays.asList(s1, s2, s3, s4);
    }

    @Override
    public String toString() {
        return "Student{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", homeDistance=" + homeDistance +
            ", weight=" + weight +
            '}';
    }
}
