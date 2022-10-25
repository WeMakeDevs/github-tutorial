package vinal;

import java.util.Scanner;

public class InrToUsd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input currency in ₹: ");
        float num1 = input.nextFloat();
        float num2 = (num1 / 82.30f);
        System.out.println("Currency in $: " + num2);
    }
}
