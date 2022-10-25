package vinal;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        int num = input.nextInt();
//        System.out.println(num);

        //type casting
//        int num = (int)(29.82f);
//        System.out.println(num);

        //automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte) (a); //257 % 256 = 1

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//
//        int d = a * b / c;
//        System.out.println(d);

//        byte b = 50;
//        b = b * 2;

//        int number = 'A';
//        System.out.println("नमस्ते");

//        System.out.println(3 * 6);

        byte b = 23;
        char c = 'v';
        short s = 1029;
        int i = 10000;
        float f = 232.29f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        // float + int + double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);
    }
}
