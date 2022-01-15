package com.company.stream;

import java.util.Arrays;

public class MyReduce {

    public static void main(String[] args) {


        int[] myArr = {1,4,6,2};
        int sum = Arrays.stream(myArr).sum();
        double avg = Arrays.stream(myArr).average().getAsDouble();
        long count = Arrays.stream(myArr).count();
        int prod = Arrays.stream(myArr).reduce(1,(x,y)-> x*y);
        System.out.println("sum :" + sum);
        System.out.println("avg :" + avg);
        System.out.println("count :" + count);
        System.out.println("product :" + prod);

    }

}
