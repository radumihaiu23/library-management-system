package com.itschool.library.utils.exam_recap;

/*
Write a program that finds the sum of all even numbers in an ArrayList of integers.
 */

import java.util.Arrays;
import java.util.List;

public class SumEvenNumbers {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 55, 12, 42, 21, 33, 22, 16);

        int sum = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        System.out.println("The sum of even numbers is: " + sum);

        int result = numbers.stream()
                .filter(number -> number % 2 == 0 )
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Result is " + result);
    }
}
