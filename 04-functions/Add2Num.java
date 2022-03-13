package CommunityClassroom;

import java.util.Scanner;

public class Add2Num {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter two numbers");
        int num1 = scn.nextInt();   //take two integer inputs from user
        int num2 = scn.nextInt();

        sum(num1, num2);

        scn.close();

    }

    static void sum(int a, int b){   //method to sum two numbers

        System.out.println("Sum of given two numbers is " + (a + b));   //sum these numbers and print the result
    }
}
