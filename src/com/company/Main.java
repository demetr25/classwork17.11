package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> testList = new ArrayList<>();
        testList.add("ebuoewfouifeboue");
        testList.add("qwerty");
        testList.add("1234546");
        testList.add("jfvuurgvoiewipoewq");

        Predicate<String> predicate = s -> s.contains("qwerty");
        testList.forEach(item -> System.out.println(predicate.test(item)));

        List<String> testList2 = new ArrayList<>();
        testList.add("qwerty");
        testList.add("rgver");
        testList.add("1234546");
        testList.add("xxx");

        BinaryOperator<List<String>> binaryOperator = (list, list2) -> {
            List<String> result = new ArrayList<>(list.size() + list2.size());
            result.addAll(list);
            result.addAll(list2);
            return result;
        };
        List<String> binOpRes = binaryOperator.apply(testList, testList2);
        System.out.println();

        Stream<String> stream = Stream.concat(testList.stream(), testList2.stream());
        stream
                .map(str -> str.toUpperCase().replace(" ", ""))
                .distinct()
                .collect(Collectors.toMap(item -> item, String::length))
                .entrySet().stream().peek(entry -> {
                    if (entry.getKey().matches("\\b\\d+\\b")) {
                        entry.setValue(0);
                    }
                }).collect(Collectors.toMap(k -> k.getKey(), v -> v.getValue()));
    }

}