package com.jwt.example.JwtExample.Assement;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Dublicate ---
 * Min- max value - with Java 8
 * 3 remove dubliate - "Java", "Python", "C#", "Java", "Kotlin", "Python" using java8
 */
public class ListAssesment {
    public static void main(String [] args){
        List<Integer> number = Arrays.asList(1,2,4,7,8,9,10,12);
        List<Integer> evenNumber= number.stream()
                .filter(num->num%2 == 0)
                .collect(Collectors.toList());

        List<Integer> oddNumber= number.stream()
                .filter(num->num%2 != 0)
                .collect(Collectors.toList());

        System.out.println("EvenList"+ evenNumber);
        System.out.println("OddLsit"+ oddNumber);
/**
 * Adding comments for the merge
 */

    }
}
