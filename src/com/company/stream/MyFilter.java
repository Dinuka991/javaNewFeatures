package com.company.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MyFilter {

    public static void main(String[] args) {

         List<Integer> myIntList = Arrays.asList(1,2,4,44,34,22,6,555,1);
         myIntList.stream().distinct().filter(i -> i>5).map(a -> a+12).forEach(System.out::println);

    }
}
