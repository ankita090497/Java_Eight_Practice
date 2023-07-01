package com.TCS;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem1 {

    // Find all the number from list that start with 1

    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(10,21,101,51,100,45,1);

        List<String> stringList = numList.stream().map(i->i+"").filter(i->i.startsWith("1")).collect(Collectors.toList());
        System.out.print("output : "+stringList);
      //numList.stream().map(i->i+"").filter(i->i.startsWith("1")).forEach(System.out::println);
    }


}
