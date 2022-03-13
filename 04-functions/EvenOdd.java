package CommunityClassroom;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        long input = scn.nextLong();    //taking input from user
        System.out.println("The inputted number is " + evenOdd(input));

        scn.close();
    }
    static String evenOdd(long num){    //method to determine even or odd

        return (num % 2 == 0)? "Even":"Odd";
    }

}
