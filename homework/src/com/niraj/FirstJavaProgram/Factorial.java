package com.niraj.FirstJavaProgram;

import java.util.Scanner;

public class Factorial {
    // Qn. 1. Write a program to print factorial of a number, also take input.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int i, fact =1;
        if (num < 0) {
            System.out.println("Please Type postive integer.");
        }
                 for (i = 1 ; i <= num ; i++ ) {
            fact = fact * i;
        }
        System.out.println(fact);

    }

}
// sorry i could not figure out how to not type "1" if we enter num = any integer.
// otherwise its cool.