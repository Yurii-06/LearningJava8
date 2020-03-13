package ua.proky.java8.task16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import org.w3c.dom.ls.LSOutput;

public class Runner {

    public static void main(String[] args) {

//        System.out.println(factorial(1));

//        LongStream
//            .rangeClosed(2, 0).forEach(System.out::println);

//        testFuncComposition();

//        testFuncLis();
//        System.out.println(0 % 2);

//        testChars();
//
//        IntStream oddNumbersStream = IntStream.iterate(1, x -> x + 2).limit(100);
//        oddNumbersStream.forEach(System.out::println);

//        long l = oddNumbersSum(21L, 30L);
//        System.out.println(l);

        Stream.of(2).forEach(System.out::println);

//        int n = 2;
//        Stream.generate(()-> n).limit(n).forEach(System.out::println);


//        List<Integer> numbers = Stream.of(1, 2, 3, 4, 5).collect(Collectors.toList());
        List<Integer> numbers = Stream.of(3).collect(Collectors.toList());

        List<Integer> collect = numbers.stream()
            .flatMapToInt(n -> IntStream.iterate(n, value -> value + 1).limit(n)).boxed()
            .collect(Collectors.toList());

        System.out.println(collect.toString());

//        List<Integer> generated = numbers.stream()
//            .flatMap(n -> Stream.generate(() -> n).limit(n))
//            .collect(Collectors.toList());
//        System.out.println(generated.toString());
//
//        List<Integer> generated2 = numbers.stream()
//            .flatMapToInt(n -> IntStream.iterate(n, val -> val + 1).limit(n))
//            .boxed()
//            .collect(Collectors.toList());
//
//        System.out.println(generated2.toString());

    }

    public static void findBadWords(long n) {
        String text = "i will f your a and you will s my d you curseWord1 a";
        List<String> badWords = Arrays.asList("curseWord1", "curseWord2", "f", "d", "a", "s", "c");

        Arrays.stream(text.split(" "))
//            .filter(x -> badWords.contains(x))
            .filter(badWords::contains)
            .distinct()
            .sorted()
            .forEach(System.out::println);
    }

    public static void combineStreams(long n) {
        IntStream evenStream = IntStream.of(30, 60);
        IntStream oddStream = IntStream.of(75, 90);

        IntStream intStream = Stream.concat(evenStream.boxed(), oddStream.boxed())
            .filter(x -> (x % 3 == 0 & x % 5 == 0))
            .sorted()
            .skip(2)
            .mapToInt(x -> x);

        intStream.forEach(System.out::println);
    }

    public static long factorial(long n) {
        // write your code here
        return LongStream.rangeClosed(2, n).reduce(1, Long::sum);
    }

    public static void testFuncComposition() {
        Function<Integer, Integer> adder = x -> x + 10;
        Function<Integer, Integer> multiplier = x -> x * 5;
        System.out.println(adder.compose(multiplier).apply(5));
//        System.out.println(multiplier.compose(adder).apply(5));

        System.out.println();
        System.out.println(adder.andThen(multiplier).apply(5));
    }


    // convert string to stream of int chars, filter all whitespaces and print all symbols
    public static void testChars() {
        String s = "d f d f d a a f";
        IntStream chars = s.chars();
        chars.filter(x -> x != 32)
            .mapToObj(x -> (char) x)
            .forEach(System.out::println);
    }

    public static long oddNumbersSum(long start, long end) {
        return LongStream.rangeClosed(start, end).filter(x -> x % 2 != 0).sum();
    }
}
