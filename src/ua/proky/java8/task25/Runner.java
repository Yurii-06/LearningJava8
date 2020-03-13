package ua.proky.java8.task25;

import java.util.List;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String[] args) {
        List<Integer> list = List.of(0, 1, 2, 3);
//        List<Integer> list = List.of(1, 2);

        Integer result = list.stream()
//            .collect(Collectors.reducing(0, i -> i * i, (a, b) -> a * b));
            .collect(Collectors.reducing(1, i -> i * i, (a, b) -> a * b));
        System.out.println(result);
    }
}
