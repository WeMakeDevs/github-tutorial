package CommunityClassroom;

import java.util.Scanner;

public class Product2Num {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter two numbers");
        int num1 = scn.nextInt();   //take two integer inputs from user
        int num2 = scn.nextInt();

        product(num1, num2);

        scn.close();

    }

    static void product(int a, int b){   //method to find product of two numbers

        System.out.println("Product of given two numbers is " + (a * b));   //multiply these numbers and print the result
    }
}
    
