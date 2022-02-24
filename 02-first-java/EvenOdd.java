package CommunityClassroom;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        long input = scn.nextLong();    //taking input from user

        if(input % 2 == 0){     // input is even if remainder is 0 on dividing it by 2
            System.out.println("Even");
        }

        else {  //otherwise it is odd
            System.out.println("Odd");
        }

        scn.close();
    }
}
