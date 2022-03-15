package CommunityClassroom;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        int num = scn.nextInt();    //taking input from user
        primeOrNot(num);

        scn.close();
    }

    static void primeOrNot( int n){ //method to find whether the inputted number is prime or not

        for(int i = 2; i*i <= n; i++){

            if(n % i == 0){
                System.out.println("Not Prime");
                return;
            }
        }

        if(n > 1){  //if n is less than 1 then it is not prime
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
        

    }
}
