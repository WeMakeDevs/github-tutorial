package vinal;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        if (num%2 == 0) {
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is Odd");
        }
    }
}
