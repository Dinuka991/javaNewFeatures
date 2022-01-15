package com.company.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyMap {
    public static void main(String[] args) {

        String[] array = {"Kasun", "charith", "charith", "charith", "Ajith", "saman", "arnold"};
        Stream<String> stream = Arrays.stream(array);
        String[] array2 = stream.map(str -> str.toUpperCase()).toArray(String[]::new);


        for (String str : array2) {
            System.out.println(str);
        }
    }
}
