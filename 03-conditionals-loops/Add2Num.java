package CommunityClassroom;

import java.util.Scanner;

public class Add2Num {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter two numbers");
        int num1 = scn.nextInt();   //take two integer inputs from user
        int num2 = scn.nextInt();

        System.out.println("Sum of two numbers is " + (num1 + num2));   //sum these numbers and print the result

        scn.close();
    }
}
