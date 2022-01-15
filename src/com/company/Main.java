package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        String[] arr = {"sam" ,"sam" , "ajith","kamal","prerera"};
        List<String> myList = new ArrayList<>(Arrays.asList(arr));

        myList.stream().map(String::toUpperCase);

        int[] arr2 = {1,33,5,6,7,55};

        Arrays.stream(arr2).filter(i -> (i>5)).map(j -> j*4).forEach(System.out::println);









    }
}
