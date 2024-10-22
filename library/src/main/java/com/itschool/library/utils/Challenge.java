package com.itschool.library.utils;

//Write a Java program that creates a list of numbers and uses the Stream API to filter
// out the even numbers and collect them into a new list. Print the new list.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(3, 8, 5, 7, 13, 2, 24);
        List<Integer> evenNumbers = myList.stream().filter( num -> num % 2 == 0).toList();
        System.out.println(evenNumbers);
    }
}