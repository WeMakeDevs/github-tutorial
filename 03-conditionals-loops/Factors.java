package CommunityClassroom;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();  //taking input of a number from user

        for(int i = 1; i <= n/2; i++){  //loop till n/2 as factor lies only within this range

            if(n % i == 0){
                System.out.print(i + " ");
            }
        }

        if(n != 1){ //if n is other than 1 then print it as it is also a factor of itself
            System.out.print(n);
        }

        scn.close();
    }
}
