package CommunityClassroom;

import java.util.Scanner;

public class SumFirstN {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();    //taking input from user
        sumFstN(num);

        scn.close();
    }

    static void sumFstN(int n){ //method to find sum of first N numbers

        long result = 0;

        for(int i = 1; i <= n; i++){    //loop iterates from 1 to n
            result += i;
        }

        System.out.println("The sum of first " + n + " numbers is " + result);
    }
}
