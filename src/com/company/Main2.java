package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            list.add(i);
        }

        Integer sum =0;
        for (Integer integer : list) {
            if(integer % 2 != 0) {
                sum +=integer;
            }
        }
        System.out.println(sum);

        Stream<Integer> stream = list.stream();
        stream = stream.filter(val ->val % 2 !=0);
        Optional<Integer> reduceOptional = stream.reduce((currentItem, resultItem) -> currentItem + resultItem);
        Integer result = reduceOptional.orElse(0);
        System.out.println(result);
    }
}
