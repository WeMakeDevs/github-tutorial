package CommunityClassroom;

import java.util.*;

public class Fibonacci {
    
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        System.out.println(Fibonacci.fibonacciLoop(n));

        scn.close();
        
    }

    static int fibonacciLoop(int n){

        int a = 0; //first and second element of fibonacci series
        int b = 1;

        if (n < 2 ){ //if n less than 2 then fibonacci element is the n itself
            return n;
        }
        int count = 2;
        int third = 0;

        while(count <= n){ //finds the fibonacci element at nth position using while loop

            third = a + b;
            
            a = b;
            b = third;

            count++;

        }

        return third;
    }
}
