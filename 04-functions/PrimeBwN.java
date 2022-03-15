package CommunityClassroom;

import java.util.Scanner;

public class PrimeBwN {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        int num1 = scn.nextInt();    //taking input of two numbers from user
        int num2 = scn.nextInt();

        for(int i = num1; i<= num2; i++){   //loop iterating between the given inputs(including both numbers)
            prime(i);
        }
        
        scn.close();
    }

    static void prime( int n){ //method to find whether the inputted number is prime or not

        for(int i = 2; i*i <= n; i++){

            if(n % i == 0){
                return;
            }
        }

         //if n is less than 1 then it is not prime
         if(n > 1){
            System.out.println(n);
         }
         

}

}
