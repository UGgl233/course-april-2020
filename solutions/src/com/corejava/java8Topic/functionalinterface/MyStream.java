package com.corejava.java8Topic.functionalinterface;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Bangyi Yang
 * @created 2020/05/05
 */
public class MyStream {
    @FunctionalInterface
    public interface MyInterface {
        List<Integer> MyMap(List<Integer> l);
    }

    public static List<Integer> MyMap(List<Integer> l) {
        List<Integer> res = new LinkedList<>();
        for (Integer i : l) res.add(i * 3);
        return res;
    }

    public static void main(String[] args) {
        // 1 - General
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(MyStream.MyMap(list));

        MyInterface lambda = (List<Integer> lst) -> lst.stream()
                .map(x -> x * 3)
                .collect(Collectors.toList());

        // 2 - lambda
        System.out.println(lambda.MyMap(list));
    }
}
