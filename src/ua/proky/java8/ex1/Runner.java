package ua.proky.java8.ex1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        List<Student> studentList = Student.getStudentList();
        // first compare by age and if age is equals then compare by Name
        Comparator<Student> compareByName = Comparator
            .comparing(Student::getAge)
            .thenComparing(Student::getName);

        Collections.sort(studentList, compareByName);
        studentList.forEach(System.out::println);

    }
}
