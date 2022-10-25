package vinal;

import java.util.Scanner;

public class LargeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter second number: ");
        int num2 = input2.nextInt();

        if (num1 > num2){
            System.out.println("Large number is: " + num1);
        } else if (num1 < num2) {
            System.out.println("Large number is: " + num2);
        } else {
            System.out.println("Both are equal");
        }
    }
}

