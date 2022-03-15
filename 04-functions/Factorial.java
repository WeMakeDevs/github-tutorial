package CommunityClassroom;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();  //input of an integer from user
        System.out.println("Factorial is " + factorial(num));

        scn.close();
    }

    static long factorial(int num) {    //method to find factorial of inputted number

        long pdt = 1;
        for(int i = 1; i<= num; i++){

            pdt *= i;
        }
        return pdt;
    }
}
