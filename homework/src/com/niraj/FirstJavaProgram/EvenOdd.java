package com.niraj.FirstJavaProgram;

import java.util.Scanner;

public class EvenOdd {
    //Qn. Write a program to print whether a number is even or odd, also take input

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if ( num % 2 == 0 ) {
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }
if (num < 0) {
    System.out.println("Please type positive integer");
}
    }
}
